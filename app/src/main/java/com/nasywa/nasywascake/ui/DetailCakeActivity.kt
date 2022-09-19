package com.nasywa.nasywascake.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.nasywa.nasywascake.R

class DetailCakeActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_DETAIL = "extra_detail"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_cake)

        var actionBar = getSupportActionBar()
        actionBar?.setDisplayHomeAsUpEnabled(true)

        showCakeDetail()

    }

    private fun showCakeDetail() {

        val tvImageReceived: ImageView = findViewById(R.id.iv_item_photo)
        val tvNameReceived: TextView = findViewById(R.id.tv_item_name)
        val tvLocationReceived: TextView = findViewById(R.id.tv_item_location)
        val tvPriceReceived: TextView = findViewById(R.id.tv_item_price)
        val tvDetailReceived: TextView = findViewById(R.id.tv_item_detail)

        val image = intent.getIntExtra(EXTRA_PHOTO,0)
        val user = intent.getStringExtra(EXTRA_NAME)
        val location = intent.getStringExtra(EXTRA_LOCATION)
        val price = intent.getStringExtra(EXTRA_PRICE)
        val detail = intent.getStringExtra(EXTRA_DETAIL)

        tvImageReceived.setImageResource(image)
        tvNameReceived.setText("$user")
        tvLocationReceived.setText("Location:$location")
        tvPriceReceived.setText("Harga Kue: $price")
        tvDetailReceived.setText("$detail")
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}