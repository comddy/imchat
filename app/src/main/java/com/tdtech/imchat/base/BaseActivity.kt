package com.tdtech.imchat.base

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tdtech.imchat.ui.login.LoginActivity

abstract class BaseActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verify()
        setContentView(getLayoutId())

        initView()
        initData()
    }

    abstract fun getLayoutId(): Int
    abstract fun initView()
    abstract fun initData()

    private fun verify() {
        val sharedPreferences = getSharedPreferences("mysp", 0)
        val edit = sharedPreferences.edit()
        if (sharedPreferences.getString("username", "") == ""
            && sharedPreferences.getString("password", "") == "") {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}