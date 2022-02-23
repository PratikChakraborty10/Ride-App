package com.pratikchakraborty.ride_app_edvora.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Toast
import com.pratikchakraborty.ride_app_edvora.R
import com.pratikchakraborty.ride_app_edvora.fragments.FilterFragment
import com.pratikchakraborty.ride_app_edvora.fragments.NearestFragment
import com.pratikchakraborty.ride_app_edvora.fragments.PastFragment
import com.pratikchakraborty.ride_app_edvora.fragments.UpcomingFragment
import com.pratikchakraborty.ride_app_edvora.fragments.adapters.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val window = this.window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.colorPrimaryDark)
        setUpTabs()
    }

    private fun setUpTabs() {
        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(NearestFragment(), "Nearest")
        adapter.addFragment(UpcomingFragment(), "Upcoming")
        adapter.addFragment(PastFragment(), "Past")
        adapter.addFragment(FilterFragment(), "Filter")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
        tabs.getTabAt(0)
        tabs.getTabAt(1)
        tabs.getTabAt(2)
        tabs.getTabAt(3)!!.setIcon(R.drawable.ic_baseline_filter_list_24)

    }

    fun nameToast(view: View) {
        Toast.makeText(
            this@MainActivity,
            "User is set to Dhruv Singh currently",
            Toast.LENGTH_SHORT)
            .show()
    }

    fun imageToast(view: View) {
        Toast.makeText(
            this@MainActivity,
            "User is set to Dhruv Singh currently",
            Toast.LENGTH_SHORT)
            .show()
    }
}