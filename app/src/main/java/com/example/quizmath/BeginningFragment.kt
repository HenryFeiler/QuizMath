package com.example.quizmath

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.quizmath.databinding.FragmentBeginningBinding


class BeginningFragment : Fragment() {



    override fun onCreateView(

        
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentBeginningBinding>(inflater,
            R.layout.fragment_beginning,container,false)

        binding.startButton.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_beginningFragment_to_mathQuizFragment)
            //Toast.makeText(context, "Start Button was pushed!", Toast.LENGTH_SHORT).show()
        }
        return binding.root


    }

}