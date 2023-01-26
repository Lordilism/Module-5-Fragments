package com.example.yourcarrier.tabsFragement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yourcarrier.R
import kotlinx.android.synthetic.main.fragment_shorts.view.*


class ShortsFragment : Fragment() {
    companion object{
        const val KEY_SHORTS_FRAGMENT="KEY_SHORTS_FRAGMENT"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_shorts, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Get data
        val bundle=arguments.takeIf { bundle -> bundle?.containsKey(KEY_SHORTS_FRAGMENT)?:false }
        view.tvShortBodytxt.text= bundle?.getString(KEY_SHORTS_FRAGMENT)?:""
    }


}