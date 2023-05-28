package task5.data.repositories.remote


import task5.data.remote.dto.ResponseDto

interface PostsRemote {
    suspend fun getPosts() : ResponseDto
}