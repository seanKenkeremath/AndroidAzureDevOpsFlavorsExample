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
        val buildNum: TextView = findViewById(R.id.build_number)
        buildNum.text = getString(R.string.build_num_format, BuildConfig.VERSION_CODE)

    }
}
