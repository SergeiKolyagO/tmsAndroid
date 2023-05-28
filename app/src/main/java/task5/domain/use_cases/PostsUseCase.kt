package task5.domain.use_cases

import task5.data.remote.dto.toDomainPost
import task5.domain.models.Post
import task5.domain.repository.PostsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsUseCase @Inject constructor(
    private val postsRepository: PostsRepository
) {
    suspend fun getPosts() : List<Post> = postsRepository.getPosts().map {
        postDto ->  postDto.toDomainPost()
    }
}