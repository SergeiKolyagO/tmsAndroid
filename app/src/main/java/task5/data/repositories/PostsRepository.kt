package task5.data.repositories

import task5.data.remote.dto.PostDto

interface PostsRepository {
    fun getPosts() : List<PostDto>
}