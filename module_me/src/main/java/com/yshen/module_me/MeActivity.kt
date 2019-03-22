package com.yshen.module_me

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_page)
        title = "单独测试Me"

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fl_single_page,MeFragment())
            .commitAllowingStateLoss()
    }
}
