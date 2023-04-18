package com.example.task3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
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
        binding.btnNext.setOnClickListener {
            MAIN.navController.navigate(R.id.action_secondFragment_to_recyclerFragment)
        }
        initListView()
        initSpinner()
    }
    private fun initListView() {
        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            resources.getStringArray(R.array.Languages)
        )
        binding.listView1.adapter =adapter

    }
    private fun initSpinner(){
       val adapter : ArrayAdapter<*> = ArrayAdapter.createFromResource(
            requireContext(),
            R.array.Languages,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        binding.spinner1.adapter = adapter
        binding.spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                itemSelected: View,
                selectedItemPosition: Int,
                selectedId: Long
            ) {
                val choose = resources.getStringArray(R.array.Languages)
                val toast = Toast.makeText(
                    requireContext(),
                    choose[selectedItemPosition],
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

    }


}


