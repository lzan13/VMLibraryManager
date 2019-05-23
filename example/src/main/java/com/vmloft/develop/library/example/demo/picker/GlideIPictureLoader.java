package com.vmloft.develop.library.example.demo.picker;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.vmloft.develop.library.tools.picker.IPictureLoader;

import java.io.File;

/**
 * Create by lzan13 on 2019/05/19 22:30
 *
 * 实现图片选择器加载图片接口
 */
public class GlideIPictureLoader implements IPictureLoader {

    @Override
    public void loadThumb(Context context, String path, ImageView imageView, int width, int height) {
        RequestOptions options = new RequestOptions();
        options.transform(new MultiTransformation<Bitmap>(new CenterCrop(), new RoundedCorners(16)));
        Glide.with(context).load(Uri.fromFile(new File(path))).apply(options).into(imageView);
    }

    @Override
    public void loadFull(Context context, String path, ImageView imageView, int width, int height) {
        Glide.with(context).load(Uri.fromFile(new File(path))).into(imageView);
    }
}
