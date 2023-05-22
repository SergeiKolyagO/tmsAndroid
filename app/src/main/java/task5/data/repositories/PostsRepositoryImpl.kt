package task5.data.repositories

import task5.data.remote.dto.PostDto
import task5.data.repositories.remote.PostsRemote
import task5.domain.repository.PostsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsRepositoryImpl @Inject constructor(
    private val postsRemote: PostsRemote
) : PostsRepository {
    override fun getPosts(): List<PostDto> = postsRemote.getPosts()
    override fun getPostInfo(): PostDto = postsRemote.getPostInfo()

}