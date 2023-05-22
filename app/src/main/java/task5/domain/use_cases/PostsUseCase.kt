package task5.domain.use_cases

import task5.data.remote.dto.toDomainPostList
import task5.data.repositories.PostsRepositoryImpl
import task5.domain.repository.PostsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsUseCase @Inject constructor(
    private val postsRepository: PostsRepository
) {
    fun getPosts() = postsRepository.getPosts().toDomainPostList()
}