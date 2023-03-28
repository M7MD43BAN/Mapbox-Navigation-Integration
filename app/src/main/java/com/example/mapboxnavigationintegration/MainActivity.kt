package com.example.mapboxnavigationintegration

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.mapboxnavigationintegration.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var fragmentMap: MapFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initObjects()
        initSubView()
    }

    private fun initObjects() {
        fragmentMap = MapFragment()
    }

    private fun initSubView() {
        addFragment(fragmentMap)
    }

    private fun addFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_map, fragment)
        transaction.commit()
    }

    private fun removeFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.remove(fragment)
        transaction.commit()
    }
}