package task5.data.repositories.remote

import task5.data.remote.dto.PostDto

interface PostsRemote {
    fun getPosts() : List<PostDto>
}