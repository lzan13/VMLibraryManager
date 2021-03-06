package com.vmloft.develop.library.example.ui.demo.custom

import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route

import com.vmloft.develop.library.example.R.layout
import com.vmloft.develop.library.common.base.BaseActivity
import com.vmloft.develop.library.example.router.AppRouter
import com.vmloft.develop.library.tools.adapter.VMFragmentPagerAdapter

import kotlinx.android.synthetic.main.activity_demo_view_indicator.*

import java.util.ArrayList

/**
 * Create by lzan13 on 2019/04/11
 *
 * 自定义指示器验证示例
 */
@Route(path = AppRouter.appIndicator)
class IndicatorViewActivity : BaseActivity() {
    private var fragmentList: MutableList<Fragment> = mutableListOf()
    private var mAdapter: VMFragmentPagerAdapter? = null
    override fun layoutId(): Int = layout.activity_demo_view_indicator

    override fun initUI() {
        super.initUI()
        setTopTitle("自定义指示器")

        fragmentList = ArrayList()
        fragmentList.add(IndicatorViewFragment.newInstance("第 1 页"))
        fragmentList.add(IndicatorViewFragment.newInstance("第 2 页"))
        fragmentList.add(IndicatorViewFragment.newInstance("第 3 页"))

        mAdapter = VMFragmentPagerAdapter(supportFragmentManager, fragmentList)

        viewPager.offscreenPageLimit = 3
        viewPager.adapter = mAdapter

        indicatorView.setViewPager(viewPager)
    }

    override fun initData() {}
}