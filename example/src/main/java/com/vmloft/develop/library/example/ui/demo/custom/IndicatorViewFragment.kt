package com.vmloft.develop.library.example.ui.demo.custom

import android.os.Bundle

import com.vmloft.develop.library.example.R.layout
import com.vmloft.develop.library.common.base.BaseFragment

import kotlinx.android.synthetic.main.fragment_demo_default.*

/**
 * Create by lzan13 on 2019/04/09
 *
 * 通用界面 Fragment 实现容器
 */
class IndicatorViewFragment : BaseFragment() {
    private var mContent: String? = null
    override fun layoutId(): Int {
        return layout.fragment_demo_default
    }

    override fun initUI() {}

    override fun initData() {
        mContent = arguments!!.getString(ARG_CONTENT_ID)
        titleTV.text = mContent
    }

    companion object {
        private const val ARG_CONTENT_ID = "arg_content_id"

        /**
         * Fragment 的工厂方法，方便创建并设置参数
         */
        fun newInstance(content: String?): IndicatorViewFragment {
            val fragment = IndicatorViewFragment()
            val args = Bundle()
            args.putString(ARG_CONTENT_ID, content)
            fragment.arguments = args
            return fragment
        }
    }
}