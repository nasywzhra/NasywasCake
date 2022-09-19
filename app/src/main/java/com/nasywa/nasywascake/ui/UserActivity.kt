package com.nasywa.nasywascake.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.ImageView
import android.widget.TextView
import com.nasywa.nasywascake.R

class UserActivity: AppCompatActivity() {

    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_IMAGE = "extra_image"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val actionBar = supportActionBar
        actionBar!!.title = "About"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val tvImageRecieved : ImageView = findViewById(R.id.img_user_photo)
        val tvNameRecieved : TextView = findViewById(R.id.tv_name_user)
        val tvEmailRecieved : TextView = findViewById(R.id.tv_email)

        val picture = intent.getIntExtra(EXTRA_IMAGE,0)
        val user = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)

        tvImageRecieved.setImageResource(picture)
        tvNameRecieved.text = "$user"
        tvEmailRecieved.text = "$email"




    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}