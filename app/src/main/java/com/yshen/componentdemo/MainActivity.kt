package com.yshen.componentdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.yshen.module_edit.EditFragment
import com.yshen.module_index.IndexFragment
import com.yshen.module_me.MeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragments = arrayListOf(IndexFragment(), EditFragment(), MeFragment())
        val adapter = DemoAdapter(supportFragmentManager)
        adapter.setFragmentList(fragments)
        vp_main.adapter = adapter

        val titleArr = resources.getStringArray(R.array.main_tab_layout_title)
        adapter.setTitles(titleArr.toList() as ArrayList<String>)
        tl_main.setupWithViewPager(vp_main)
    }

    class DemoAdapter(fm: FragmentManager)  : FragmentStatePagerAdapter(fm) {

        private var title: ArrayList<String> = ArrayList()

        private var list: ArrayList<Fragment> = ArrayList()

        fun setFragmentList(list: ArrayList<Fragment>) {
            this.list = list
        }

        fun setTitles(list: ArrayList<String>) {
            this.title = list
        }

        override fun getItem(p0: Int): Fragment {
            return list[p0]
        }

        override fun getCount(): Int {
            return list.size
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return title[position]
        }
    }
}
