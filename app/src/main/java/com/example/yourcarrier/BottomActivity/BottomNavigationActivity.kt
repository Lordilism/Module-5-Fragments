package com.example.yourcarrier.BottomActivity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.yourcarrier.BottomFragment.BottomHomeFragment
import com.example.yourcarrier.BottomFragment.InformationsFragment
import com.example.yourcarrier.BottomFragment.NotificationsFragment
import com.example.yourcarrier.R
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigationActivity : AppCompatActivity() {
    companion object{
        fun newIntent(context: Context):Intent{
            return Intent(context, BottomNavigationActivity::class.java)

        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)
        bNavigation.setOnNavigationItemReselectedListener {item->
            when(item.itemId){

                R.id.actionHome->supportFragmentManager.commit {
                    replace(R.id.flContainer,BottomHomeFragment())
                }
                R.id.actionNotifiactions->
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.flContainer,NotificationsFragment())
                        .commit()

                R.id.actionAbout->
                    supportFragmentManager.commit {
                        replace(R.id.flContainer,InformationsFragment())
                    }



            }


        }
    }
}