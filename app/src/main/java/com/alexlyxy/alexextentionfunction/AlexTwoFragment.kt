package com.alexlyxy.alexextentionfunction

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.alexlyxy.alexextentionfunction.databinding.FragmentAlexBinding
import com.alexlyxy.alexextentionfunction.databinding.FragmentAlexTwoBinding

class AlexTwoFragment : Fragment() {

    lateinit var binding: FragmentAlexTwoBinding

    override fun onCreateView(
        inflater :LayoutInflater,container :ViewGroup?,
        savedInstanceState :Bundle?
    ) :View? {
        binding = FragmentAlexTwoBinding.inflate(inflater)
        return binding.root

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_alex_two,container,false)
    }
    companion object {
        @JvmStatic
        fun newInstance() = AlexTwoFragment()
    }
}
