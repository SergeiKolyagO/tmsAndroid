package task5.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import task5.MAIN
import com.example.task3.R
import task5.presentation.adapter.RecyclerAdapter
import com.example.task3.databinding.FragmentRecyclerBinding
import task5.domain.models.ListPost
import task5.presentation.view_models.PostsViewModel


class RecyclerFragment : Fragment() {
    private lateinit var binding: FragmentRecyclerBinding
    private var viewModel : PostsViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(requireActivity()).get(PostsViewModel::class.java)
    }

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

        val posts = viewModel?.postList?.value?: ListPost()

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = RecyclerAdapter(
                items = posts,
                onItemClickEvent = {
                MAIN.navController.navigate(R.id.action_recyclerFragment_to_detailFragment)})
        }
    }
}

