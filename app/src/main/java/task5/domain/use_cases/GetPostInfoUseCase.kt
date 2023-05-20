package task5.domain.use_cases

import task5.data.remote.dto.toPost
import task5.data.repositories.PostsRepositoryImpl

class GetPostInfoUseCase {
    fun getPostInfo() = PostsRepositoryImpl().getPostIInfo().toPost()
}