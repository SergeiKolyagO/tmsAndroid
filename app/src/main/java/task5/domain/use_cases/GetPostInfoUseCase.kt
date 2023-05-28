package task5.domain.use_cases

import task5.domain.repository.PostsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton

class GetPostInfoUseCase @Inject constructor(
    private val postsRepository: PostsRepository
) {
   // fun getPostInfo() = postsRepository.getPostInfo().toPost()
}