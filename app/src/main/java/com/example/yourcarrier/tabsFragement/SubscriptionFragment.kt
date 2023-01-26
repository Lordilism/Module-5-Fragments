package com.example.yourcarrier.tabsFragement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yourcarrier.R
import kotlinx.android.synthetic.main.fragment_subscription.view.*


class SubscriptionFragment : Fragment() {
    companion object{
        const val KEY_SUBSCRIPTION_FRAGMENT="KEY_SUBSCRIPTION_FRAGMENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_subscription, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //GET DATA
        val bundle=arguments.takeIf { bundle -> bundle?.containsKey(KEY_SUBSCRIPTION_FRAGMENT)?:false  }
        view.tvSubscriptionBodytxt.text= bundle?.getString(KEY_SUBSCRIPTION_FRAGMENT) ?:""

    }


}