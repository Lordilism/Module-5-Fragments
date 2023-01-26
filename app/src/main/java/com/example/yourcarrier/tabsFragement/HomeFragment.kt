package com.example.yourcarrier.tabsFragement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yourcarrier.BottomActivity.BottomNavigationActivity
import com.example.yourcarrier.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {
    companion object{
        const val KEY_HOME_DESCRIPTION= "KEY_HOME_DESCRIPTION"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
        
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bundle=arguments.takeIf {
            bundle -> bundle?.containsKey(KEY_HOME_DESCRIPTION)?:false
        }
        tvHomeBodytxt.text=bundle?.getString(KEY_HOME_DESCRIPTION)?:""
        view.btnBottomNavigation.setOnClickListener {
            startActivity(BottomNavigationActivity.newIntent(view.context))
        }

    }



}