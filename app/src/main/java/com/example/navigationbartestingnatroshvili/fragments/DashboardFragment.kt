package com.example.navigationbartestingnatroshvili.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.navigationbartestingnatroshvili.R

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.textView).text =
            DashboardFragmentArgs.fromBundle(requireArguments()).ammunt.toString()
    }
}