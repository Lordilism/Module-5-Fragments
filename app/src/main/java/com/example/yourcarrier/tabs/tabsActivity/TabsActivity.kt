package com.example.yourcarrier.tabs.tabsActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yourcarrier.R
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_tabs.*

class TabsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tabs)
        //Set up ViewPager
         val differenceScreensViewPagerAdapter = DifferenceScreensViewPagerAdapter(this)
        viewPagerDifferenceScreens.adapter= differenceScreensViewPagerAdapter

        //set up tab layout
        TabLayoutMediator(tabLayoutDifferentScreens,viewPagerDifferenceScreens){tab,position->
            when(position){
                0->tab.text="Home"
                1-> tab.text="Shorts"
                else->tab.text="Subscription"
            }

        }.attach()

    }
}