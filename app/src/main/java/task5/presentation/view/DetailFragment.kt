package task5.presentation.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import task5.MAIN
import com.example.task3.R
import com.example.task3.databinding.FragmentDetailBinding
import dagger.hilt.android.AndroidEntryPoint
import task5.domain.models.Post
import task5.presentation.view_models.PostViewModelInfo

@AndroidEntryPoint
class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding
    private val viewModel : PostViewModelInfo by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        binding.buttonBack.setOnClickListener{
            MAIN.navController.navigate(R.id.action_detailFragment_to_recyclerFragment)
        }
    }
    private fun initViews(){
        initRecycler()

    }
    private fun initRecycler() {
        val postInfo = viewModel.postInfo.value ?: Post()

        binding.apply {
            heading.text = postInfo.title
            infoText.text = postInfo.description
        }
    }

}


