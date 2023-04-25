package com.example.task3.view

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.task3.MAIN
import com.example.task3.adapter.RecyclerAdapter
import com.example.task3.data.PocemonDataSource
import com.example.task3.databinding.FragmentRecyclerBinding
import com.example.task3.model.Pocemon


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
      //  val inf = ArrayList<Pocemon>()


        val adapter = RecyclerAdapter(PocemonDataSource().elements())
        binding.recyclerView.adapter = adapter
        adapter.setOnItemClickListener(object : RecyclerAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {
                //Toast.makeText(requireContext(),"item $position",Toast.LENGTH_SHORT).show()
                val intent = Intent(requireContext(), DetailFragment::class.java)





            }

        })









    }
//    private fun listOfElements(): List<String> {
//        val data = mutableListOf<String>()
//        (0..15).forEach {i -> data.add() }
//        return data
//    }
}