package com.vmloft.develop.library.example.base

import android.view.View

import com.vmloft.develop.library.example.R.drawable
import com.vmloft.develop.library.example.R.id
import com.vmloft.develop.library.tools.base.VMBActivity
import com.vmloft.develop.library.tools.utils.VMDimen
import com.vmloft.develop.library.tools.utils.VMTheme
import com.vmloft.develop.library.tools.widget.VMTopBar

abstract class AppActivity : VMBActivity() {
    /**
     * 通用的获取 TopBar 方法
     */
    // 统一的 TopBar
    protected var topBar: VMTopBar? = null
    protected var mSpaceView: View? = null
    override fun initUI() {
        VMTheme.setDarkStatusBar(mActivity, true)
        setupTobBar()
    }

    /**
     * 装载 TopBar
     */
    protected fun setupTobBar() {
        mSpaceView = findViewById(id.common_top_space)
        if (mSpaceView != null) {
            // 设置状态栏透明主题时，布局整体会上移，所以给头部 View 设置 StatusBar 的高度
            mSpaceView!!.layoutParams.height = VMDimen.getStatusBarHeight()
        }
        topBar = findViewById(id.common_top_bar)
        if (topBar != null) {
            topBar!!.setIcon(drawable.ic_arrow_left)
            topBar!!.setIconListener { onBackPressed() }
        }
    }

    /**
     * 设置图标
     */
    protected fun setTopIcon(resId: Int) {
        if (topBar != null) {
            topBar!!.setIcon(resId)
        }
    }

    /**
     * 设置标题
     */
    protected fun setTopTitle(title: String?) {
        if (topBar != null) {
            topBar!!.setTitle(title)
        }
    }

    /**
     * 设置子标题
     */
    protected fun setTopSubtitle(title: String?) {
        if (topBar != null) {
            topBar!!.setSubtitle(title)
        }
    }

}