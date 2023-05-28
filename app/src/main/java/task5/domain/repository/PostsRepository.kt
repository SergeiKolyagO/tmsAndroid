package task5.domain.repository

import task5.data.remote.dto.PostDto

interface PostsRepository {
    suspend fun getPosts(): List<PostDto>

}