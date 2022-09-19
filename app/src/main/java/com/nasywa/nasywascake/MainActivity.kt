package com.nasywa.nasywascake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nasywa.nasywascake.data.CakeDataObject
import com.nasywa.nasywascake.data.CakesData
import com.nasywa.nasywascake.ui.DetailCakeActivity
import com.nasywa.nasywascake.ui.ListCakesAdapter
import com.nasywa.nasywascake.ui.UserActivity

class MainActivity : AppCompatActivity() {
    private lateinit var rvCakes: RecyclerView
    private var list: ArrayList<CakesData> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCakes = findViewById(R.id.rv_cake)
        rvCakes.setHasFixedSize(true)
        list.addAll(CakeDataObject.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvCakes.layoutManager = LinearLayoutManager(this)
        val listCakesAdapter = ListCakesAdapter(list)
        rvCakes.adapter = listCakesAdapter

        listCakesAdapter.setOnItemClickCallback(object : ListCakesAdapter.OnItemClickCallback {
            override fun onItemClickedData(data: CakesData) {
                showSelectedCake(data)
            }
        })
    }

    private fun showSelectedCake(data: CakesData) {
        val detailCakeActivity =
            Intent(this@MainActivity, DetailCakeActivity::class.java).apply {
            putExtra(DetailCakeActivity.EXTRA_NAME, data.cakeName)
            putExtra(DetailCakeActivity.EXTRA_LOCATION, data.location)
            putExtra(DetailCakeActivity.EXTRA_PRICE, data.price)
            putExtra(DetailCakeActivity.EXTRA_DETAIL, data.detail)
            putExtra(DetailCakeActivity.EXTRA_PHOTO, data.photo)
        }
        startActivity(detailCakeActivity)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(SelectedMode: Int){
        R.id.action_user;run {
            val moveIntent = Intent(this@MainActivity, UserActivity::class.java)
            moveIntent.putExtra(UserActivity.EXTRA_IMAGE,R.drawable.profilenasywaaa)
            moveIntent.putExtra(UserActivity.EXTRA_NAME,"Nasywa Zahra Nailah")
            moveIntent.putExtra(UserActivity.EXTRA_EMAIL,"nasywazahranailah@gmail.com")
            startActivity(moveIntent)

        }
    }

}