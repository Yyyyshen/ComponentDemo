package com.yshen.module_edit

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class EditActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_page)
        title = "单独测试Edit"

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fl_single_page,EditFragment())
            .commitAllowingStateLoss()
    }
}
