package com.example.task3.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task3.adapter.RecyclerAdapter
import com.example.task3.data.PocemonDataSource
import com.example.task3.databinding.FragmentRecyclerBinding



class RecyclerFragment : Fragment() {
    private lateinit var binding: FragmentRecyclerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRecyclerBinding.inflate(layoutInflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val nameDataSet = PocemonDataSource().loadInfo()
//        binding.recyclerView.adapter = RecyclerAdapter(context,nameDataSet)
        initRecycler()



    }
    private fun initRecycler(){


//        binding.recyclerView.apply {
//            layoutManager = LinearLayoutManager(requireContext())
//            adapter = RecyclerAdapter(PocemonDataSource().loadInfo())
//
//        }
        var adapter =RecyclerAdapter(PocemonDataSource().loadInfo())
        binding.recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : RecyclerAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                Toast.makeText(requireContext(),"item $position",Toast.LENGTH_SHORT).show()
            }

        })









    }
//    private fun listOfElements(): List<String> {
//        val data = mutableListOf<String>()
//        (0..15).forEach {i -> data.add("$i item") }
//        return data
//    }
}