package task5.data.repositories

import task5.data.remote.dto.PostDto
import task5.data.repositories.remote.PostsRemoteImpl

class PostsRepositoryImpl : PostsRepository{
    override fun getPosts(): List<PostDto> = PostsRemoteImpl().getPosts()
    override fun getPostIInfo(): PostDto = PostsRemoteImpl().getPostInfo()

}