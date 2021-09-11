package com.example.livedata_fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.livedata_fragments.R
import com.example.livedata_fragments.dataclass.DataClass
import kotlinx.android.synthetic.main.fragment_b.*

class FragmentB : Fragment() {

    val dataClass = DataClass()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnFragB.setOnClickListener {
            dataClass.getFragment_BnewData()
        }

        dataClass.getMediaterLiveData().observe(viewLifecycleOwner,{
            tvTextB.text =it
        })
    }

}