package task5.domain.repository

import task5.data.remote.dto.PostDto

interface PostsRepository {
    fun getPosts(): List<PostDto>
    fun getPostInfo(): PostDto

}