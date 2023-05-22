package task5.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import task5.domain.models.Post
import task5.domain.use_cases.GetPostInfoUseCase
import javax.inject.Inject

@HiltViewModel
class PostViewModelInfo @Inject constructor(
    private val getPostInfoUseCase : GetPostInfoUseCase
) : ViewModel() {
    private val _postInfo = MutableLiveData<Post>()
    val postInfo : LiveData<Post> = _postInfo

    init {
        getPostInfo()
    }

    private fun getPostInfo(){
        _postInfo.value = getPostInfoUseCase.getPostInfo()
    }
}