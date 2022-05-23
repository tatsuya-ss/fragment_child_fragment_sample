package com.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fragment_child_fragment_sample.R
import com.example.fragment_child_fragment_sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        val mainFragment = MainFragment()
        fragmentTransaction.add(R.id.clMain, mainFragment)
        fragmentTransaction.commit()
    }
}