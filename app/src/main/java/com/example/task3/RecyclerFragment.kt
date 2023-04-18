package com.example.task3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
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
        initRecycler()

    }
    private fun initRecycler(){
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = RecyclerAdapter(listOfElements())
        }
    }
    private fun listOfElements(): List<String> {
        val data = mutableListOf<String>()
        (0..100).forEach {i -> data.add("$i item") }
        return data
    }
}