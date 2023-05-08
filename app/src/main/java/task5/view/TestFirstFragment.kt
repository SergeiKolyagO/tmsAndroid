package task5.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.task3.R
import com.example.task3.databinding.FragmentTestFirstBinding


class TestFirstFragment : Fragment() {

    private lateinit var binding: FragmentTestFirstBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTestFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.oneTestButton.setOnClickListener{
            parentFragmentManager
                .beginTransaction()
                .replace(R.id.fcvMain, TestSecondFragment())
                .commit()
        }
    }

}