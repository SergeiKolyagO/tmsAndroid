package task5.presentation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import task5.MAIN
import com.example.task3.R
import com.example.task3.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLoginBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.passwordEditText.addTextChangedListener {
            binding.loginButton.isEnabled = binding.passwordEditText.text.length > 8
        }

        binding.loginButton.setOnClickListener{
            MAIN.navController.navigate(R.id.action_login_fragment_to_recyclerFragment)
        }
    }

}