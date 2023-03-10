package com.example.yourcarrier.tabsFragement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.yourcarrier.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_second.view.*


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.btnSecondFragment.setOnClickListener {
            Snackbar.make(view,"Second Fragment",Snackbar.LENGTH_SHORT).show()
        }
    }


}