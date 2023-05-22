package task5.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import task5.MAIN
import com.example.task3.R
import task5.presentation.adapter.RecyclerAdapter
import com.example.task3.databinding.FragmentRecyclerBinding
import dagger.hilt.android.AndroidEntryPoint
import task5.domain.models.ListPost
import task5.presentation.view_models.PostsViewModel

@AndroidEntryPoint
class RecyclerFragment : Fragment() {
    private lateinit var binding: FragmentRecyclerBinding
    private val viewModel : PostsViewModel by viewModels()



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

        val posts = viewModel.postList.value?: ListPost()

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = RecyclerAdapter(
                items = posts,
                onItemClickEvent = {
                MAIN.navController.navigate(R.id.action_recyclerFragment_to_detailFragment)})
        }
    }
}

