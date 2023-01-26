package com.example.yourcarrier.tabs.tabsActivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.yourcarrier.tabsFragement.HomeFragment.Companion.KEY_HOME_DESCRIPTION
import com.example.yourcarrier.tabsFragement.ShortsFragment.Companion.KEY_SHORTS_FRAGMENT
import com.example.yourcarrier.tabsFragement.SubscriptionFragment.Companion.KEY_SUBSCRIPTION_FRAGMENT
import com.example.yourcarrier.tabsFragement.HomeFragment
import com.example.yourcarrier.tabsFragement.ShortsFragment
import com.example.yourcarrier.tabsFragement.SubscriptionFragment

class DifferenceScreensViewPagerAdapter(fragmentActivity: AppCompatActivity) :
    FragmentStateAdapter(fragmentActivity) {


    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                val homeFragment = HomeFragment()
                //put data
                val bundle = Bundle()
                bundle.putString(KEY_HOME_DESCRIPTION, "This is Home Fragment")
                homeFragment.arguments = bundle

                return homeFragment
            }
            1 -> {
                val shortsFragment = ShortsFragment()
                //put data
                val bundle = Bundle()
                bundle.putString(KEY_SHORTS_FRAGMENT, "This is Shorts Fragment")
                shortsFragment.arguments = bundle
                return shortsFragment
            }
            else -> {
                val subscriptionFragment = SubscriptionFragment()
                //Put data
                val bundle = Bundle()
                bundle.putString(KEY_SUBSCRIPTION_FRAGMENT, "This is Subscription Fragment")
                subscriptionFragment.arguments = bundle
                return subscriptionFragment
            }
        }
    }
}