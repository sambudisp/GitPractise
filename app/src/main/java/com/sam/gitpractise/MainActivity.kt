package com.sam.gitpractise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("ini adalah konten komitan ke-2")
        println("ini adalah konten komitan ke-5")
        println("ini adalah konten komitan eksperimental")
    }
}