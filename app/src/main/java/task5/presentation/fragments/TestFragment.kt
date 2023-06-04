package task5.presentation.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.viewModelScope
import com.example.task3.databinding.TestFragmentBinding
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import task5.presentation.view_models.TestViewModel

class TestFragment : Fragment() {
    private lateinit var binding: TestFragmentBinding
    private val viewModel: TestViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = TestFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        workWithMultithreading()
    }

    private fun workWithMultithreading() {
        workWithCoroutines()
    }

    private fun workWithCoroutines() =
        viewModel.viewModelScope.launch {
            Log.d("TEST_ANDROID", "Start work with downloading file")
            downloadFilesAsync()
            downloadFilesLaunch()
            Log.d("TEST_ANDROID", "All uploaded!")

        }

    private suspend fun downloadFilesAsync () = withContext(IO){
        coroutineScope {
            async { (downloadFirstFile()) }
            async { (downloadTwoFile ()) }
            async { downloadThreeFile() }
            async { (downloadFourFile()) }
            async { downloadFiveFile() }
        }

    }


    private suspend fun downloadFirstFile() = withContext(IO) {
        Log.d("TEST_ANDROID", ".... starting async download first file.....")
        delay(1_000)
        Log.d("TEST_ANDROID", ".... first file async download finished ! .....")
    }
    private suspend fun downloadTwoFile() = withContext(IO) {
        Log.d("TEST_ANDROID", ".... starting async download two file.....")
        delay(1_000)
        Log.d("TEST_ANDROID", ".... two file async download finished ! .....")
    }
    private suspend fun downloadThreeFile() = withContext(IO) {
        Log.d("TEST_ANDROID", ".... starting async download three file.....")
        delay(1_000)
        Log.d("TEST_ANDROID", ".... three file async download finished ! .....")
    }
    private suspend fun downloadFourFile() = withContext(IO) {
        Log.d("TEST_ANDROID", ".... starting async download four file.....")
        delay(1_000)
        Log.d("TEST_ANDROID", ".... four file async download finished ! .....")
    }
    private suspend fun downloadFiveFile() = withContext(IO) {
        Log.d("TEST_ANDROID", ".... starting async download five file.....")
        delay(1_000)
        Log.d("TEST_ANDROID", ".... five file async download finished ! .....")
    }


}
private suspend fun downloadFilesLaunch() = withContext(IO){
    coroutineScope {
        launch { (downloadFirstFile()) }
        launch { (downloadTwoFile ()) }
        launch { downloadThreeFile() }
        launch { (downloadFourFile()) }
        launch { downloadFiveFile() }
    }

}
private suspend fun downloadFirstFile() = withContext(IO) {
    Log.d("TEST_ANDROID", ".... starting launch download first file.....")
    delay(2_000)
    Log.d("TEST_ANDROID", ".... first file launch download finished ! .....")
}
private suspend fun downloadTwoFile() = withContext(IO) {
    Log.d("TEST_ANDROID", ".... starting launch download two file.....")
    delay(2_000)
    Log.d("TEST_ANDROID", ".... two file launch download finished ! .....")
}
private suspend fun downloadThreeFile() = withContext(IO) {
    Log.d("TEST_ANDROID", ".... starting launch download three file.....")
    delay(2_000)
    Log.d("TEST_ANDROID", ".... three file launch download finished ! .....")
}
private suspend fun downloadFourFile() = withContext(IO) {
    Log.d("TEST_ANDROID", ".... starting launch download four file.....")
    delay(2_000)
    Log.d("TEST_ANDROID", ".... four file launch download finished ! .....")
}
private suspend fun downloadFiveFile() = withContext(IO) {
    Log.d("TEST_ANDROID", ".... starting launch download five file.....")
    delay(2_000)
    Log.d("TEST_ANDROID", ".... five file launch download finished ! .....")
}