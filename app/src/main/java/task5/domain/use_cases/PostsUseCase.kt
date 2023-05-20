package task5.domain.use_cases

import task5.data.remote.dto.toDomainPostList
import task5.data.repositories.PostsRepositoryImpl


class PostsUseCase {
    fun getPosts() = PostsRepositoryImpl().getPosts().toDomainPostList()
}