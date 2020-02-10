package com.seank.azuredevopstest

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val domainName: TextView = findViewById(R.id.domain_name)
        domainName.text = BuildConfig.DOMAIN_NAME
        val appSecret: TextView = findViewById(R.id.app_secret)
        appSecret.text = getString(R.string.app_secret_format, BuildConfig.APP_SECRET)
        val buildNum: TextView = findViewById(R.id.build_number)
        buildNum.text = getString(R.string.build_num_format, BuildConfig.VERSION_CODE)
        val versionName: TextView = findViewById(R.id.version_name)
        versionName.text = getString(R.string.version_name_format, BuildConfig.VERSION_NAME)
    }
}
