package task5.presentation.view_models

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import task5.domain.models.ListPost
import task5.domain.use_cases.PostsUseCase
import javax.inject.Inject

@HiltViewModel
open class PostsViewModel @Inject constructor(
    private val postsUseCase: PostsUseCase
) : ViewModel(){

    private val _postList = MutableLiveData<ListPost>()
    val postList: LiveData<ListPost> = _postList

    init {
        getPosts()
    }

    private fun getPosts (){
        _postList.value = postsUseCase.getPosts()
    }
}