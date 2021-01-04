package com.vmloft.develop.library.example.ui.main.mine


import androidx.fragment.app.Fragment
import com.vmloft.develop.library.example.R
import com.vmloft.develop.library.example.base.BaseFragment
import com.vmloft.develop.library.example.router.AppRouter
import com.vmloft.develop.library.example.utils.toast
import com.vmloft.develop.library.example.widget.BehaviorLinearLayout
import com.vmloft.develop.library.tools.utils.VMDimen
import kotlinx.android.synthetic.main.fragment_mine.*


/**
 * Create by lzan13 on 2020/05/02 11:54
 * 描述：我的
 */
class MineFragment : BaseFragment() {

    override fun layoutId() = R.layout.fragment_mine

    override fun initUI() {
        super.initUI()

        mineInfoCL.setOnClickListener { AppRouter.go(AppRouter.appInfo) }
        initBehavior()

    }

    override fun initData() {

    }

    private fun initBehavior() {
        mineBehaviorLayout.setHeaderScrollListener(object : BehaviorLinearLayout.HeaderScrollListener {
            override fun onScroll(dy: Int) {}
            override fun onHeaderTotalHide() {
//                toast("header hide")
            }

            override fun onHeaderTotalShow() {
//                toast("header show")
            }
        })
        mineBehaviorLayout.setHeaderBackground(mineCoverIV)
        mineBehaviorLayout.setMaxHeaderHeight(VMDimen.dp2px(360))
        mineAvatarIV.setOnClickListener { toast("点击头像") }
        mineNameTV.setOnClickListener { toast("点击名字") }

        val titles = arrayOf("最新", "热门", "我的")
        val fragments: ArrayList<Fragment> = ArrayList()
        for (i in titles.indices) {
            fragments.add(TabFragment())
            tabLayout.addTab(tabLayout.newTab())
        }
        tabLayout.setupWithViewPager(viewPager, false)
        viewPager.adapter = TabFragmentPagerAdapter(childFragmentManager, fragments)
        for (i in titles.indices) {
            tabLayout.getTabAt(i)?.text = titles[i]
        }
    }
}