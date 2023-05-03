package com.example.task3.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task3.MAIN
import com.example.task3.R
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
        initRecycler()
    }
    private fun initRecycler(){

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = RecyclerAdapter(
                items = PocemonDataSource().elements(),
                onItemClickEvent = {
                MAIN.navController.navigate(R.id.action_recyclerFragment_to_detailFragment)})
        }
    }
}

