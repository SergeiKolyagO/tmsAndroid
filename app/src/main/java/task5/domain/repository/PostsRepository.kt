package task5.domain.repository

import task5.domain.models.Post

interface PostsRepository {
    fun getPosts() : List<Post>
}