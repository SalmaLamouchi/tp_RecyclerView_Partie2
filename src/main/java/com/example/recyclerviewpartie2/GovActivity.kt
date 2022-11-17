package com.example.recyclerviewpartie2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class GovActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gov)
        val headingGovs : TextView = findViewById(R.id.heading)
        val mainGovs :TextView =findViewById(R.id.news)
        val imageGovs :ImageView =findViewById(R.id.image_heading)
        val bundle : Bundle ?= intent.extras
        val heading =bundle!!.getString("heading")
        val imageId = bundle.getInt("imageId")
        val news = bundle.getString("govsArtical")
        headingGovs.text=heading
        mainGovs.text=news
        imageGovs.setImageResource(imageId)


    }
}