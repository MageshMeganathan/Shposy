package com.ssb.shopsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout : DrawerLayout = findViewById(R.id.drawerLayout)
        val navView : NavigationView = findViewById(R.id.navView)

        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> Toast.makeText(applicationContext,"Clicked Home",Toast.LENGTH_SHORT).show()
                R.id.allCategories -> Toast.makeText(applicationContext,"Clicked All Categories",Toast.LENGTH_SHORT).show()
                R.id.offerZone -> Toast.makeText(applicationContext,"Clicked Offer Zone",Toast.LENGTH_SHORT).show()
                R.id.sellOnFlipkart -> Toast.makeText(applicationContext,"Clicked Sell On Flipkart",Toast.LENGTH_SHORT).show()
                R.id.myOrder -> Toast.makeText(applicationContext,"Clicked My Order",Toast.LENGTH_SHORT).show()
                R.id.myRewards -> Toast.makeText(applicationContext,"Clicked My Rewards",Toast.LENGTH_SHORT).show()
                R.id.myWishlist -> Toast.makeText(applicationContext,"Clicked My Wishlist",Toast.LENGTH_SHORT).show()
                R.id.myCart -> Toast.makeText(applicationContext,"Clicked My Cart",Toast.LENGTH_SHORT).show()
                R.id.myAccount -> Toast.makeText(applicationContext,"Clicked My Account",Toast.LENGTH_SHORT).show()
                R.id.logOut -> Toast.makeText(applicationContext,"Clicked Log Out",Toast.LENGTH_SHORT).show()

            }
            true
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}