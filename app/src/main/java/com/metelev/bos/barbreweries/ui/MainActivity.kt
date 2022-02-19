package com.metelev.bos.barbreweries.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.metelev.bos.barbreweries.R
import com.metelev.bos.barbreweries.ui.list.BreweriesListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null)
            supportFragmentManager.beginTransaction()
                .replace(R.id.activity_main, BreweriesListFragment())
                .commit()
    }
}