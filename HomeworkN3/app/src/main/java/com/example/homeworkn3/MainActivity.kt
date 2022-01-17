package com.example.homeworkn3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.homeworkn3.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var tabLayout : TabLayout
    private lateinit var viewPager2: ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById((R.id.viewPager))

        viewPager2.adapter = ViewPagerFragmentAdapter(this)

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
                tab.text = "Tab ${position + 1}"
        }.attach()
    }
}