package com.alexlyxy.alexextentionfunction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.alexlyxy.alexextentionfunction.databinding.FragmentAlexBinding

class AlexFragment : Fragment() {

    lateinit var binding: FragmentAlexBinding

    override fun onCreateView(
        inflater :LayoutInflater,container :ViewGroup?,
        savedInstanceState :Bundle?
    ) :View? {
        binding = FragmentAlexBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view :View,savedInstanceState :Bundle?) {
        binding.alexFragButton.setOnClickListener {
            openFragment(AlexTwoFragment.newInstance())
        }

        /*val but = findViewById<Button>(R.id.alexFragButton)
        but.setOnClickListener {
            openFragment(AlexTwoFragment.newInstance())
        } */

    }

    companion object {
        @JvmStatic
        fun newInstance() = AlexFragment()
    }
}