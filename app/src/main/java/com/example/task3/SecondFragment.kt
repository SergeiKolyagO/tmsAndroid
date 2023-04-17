package com.example.task3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.task3.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
            MAIN.navController.navigate(R.id.action_secondFragment_to_first_fragment)
        }
        setupListWithArrayAdapter()
        setupSpinnerWithAdapter()
    }
    private fun setupListWithArrayAdapter(){

        val adapter = ArrayAdapter.createFromResource(requireContext(),R.array.Languages,android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.spinner1.adapter = adapter
    }
    private fun setupSpinnerWithAdapter(){
        val adapter = ArrayAdapter.createFromResource(requireContext(),R.array.Languages,android.R.layout.simple_spinner_item)
        binding.listView1.adapter = adapter
    }


}


