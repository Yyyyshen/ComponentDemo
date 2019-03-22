package com.yshen.module_index

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class IndexActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_page)
        title = "单独测试Index"

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fl_single_page,IndexFragment())
            .commitAllowingStateLoss()
    }
}
