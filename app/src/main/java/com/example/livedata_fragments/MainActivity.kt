package com.example.livedata_fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.livedata_fragments.fragments.FragmentA
import com.example.livedata_fragments.fragments.FragmentB


class MainActivity : AppCompatActivity() {

    lateinit var fragmentManager : FragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.livedata_fragments.R.layout.activity_main)
        fragmentManager = supportFragmentManager
        setFragmentA()
        setFragmentB()
    }

    private fun setFragmentA() {
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragmentA = FragmentA()
        fragmentTransaction.replace(com.example.livedata_fragments.R.id.flContainer1, fragmentA, "FragmentA")
            .addToBackStack("fragB").commit()
    }
    private fun setFragmentB() {
        val fragmentTransaction = fragmentManager.beginTransaction()
        val fragmentB = FragmentB()
        fragmentTransaction.replace(com.example.livedata_fragments.R.id.flcontainer2, fragmentB, "FragmentA")
            .addToBackStack("fragB").commit()
    }
}