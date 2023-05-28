package task5.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import task5.domain.models.Post
import task5.domain.use_cases.PostsUseCase
import javax.inject.Inject

@HiltViewModel
open class PostsViewModel @Inject constructor(
    private val postsUseCase: PostsUseCase
) : ViewModel(){

    private val _postList = MutableLiveData<List<Post>>()
    val postList: LiveData<List<Post>> = _postList

    init {
        viewModelScope.launch {
            getPosts()
        }

    }

    private suspend fun getPosts (){
        _postList.value = postsUseCase.getPosts()
    }
}