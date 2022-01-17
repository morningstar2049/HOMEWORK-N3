package com.example.homeworkn3.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.homeworkn3.fragments.FirstFragment
import com.example.homeworkn3.fragments.SecondFragment
import com.example.homeworkn3.fragments.ThirdFragment

class ViewPagerFragmentAdapter(activity: AppCompatActivity):FragmentStateAdapter(activity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        if(position == 0){
            return FirstFragment()
        }else if(position == 1){
            return SecondFragment()
        }
        return ThirdFragment()
    }
}