package com.example.yourcarrier.tabs.tabsActivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.yourcarrier.R
import com.example.yourcarrier.tabsFragement.FirstFragment
import com.example.yourcarrier.tabsFragement.SecondFragment

class FragmentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
//        supportFragmentManager.beginTransaction()
//            .add(R.id.firstFragmentContainerView,SecondFragment())
//            .add(R.id.secondFragmentContainerView,FirstFragment())
//            .commit()

        supportFragmentManager.commit{
            add<FirstFragment>(R.id.firstFragmentContainerView)
            add<SecondFragment>(R.id.secondFragmentContainerView)


        }


    }
}