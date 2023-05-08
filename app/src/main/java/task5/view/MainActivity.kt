package task5.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
//import androidx.navigation.Navigation
import task5.MAIN
//import com.example.task3.R
import com.example.task3.databinding.ActivityMainBinding
//import com.example.task5.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //navController = Navigation.findNavController(this, R.id.fcvMain)

        MAIN = this
    }
}