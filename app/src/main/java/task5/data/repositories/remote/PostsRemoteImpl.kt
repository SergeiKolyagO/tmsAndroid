package task5.data.repositories.remote

import task5.data.remote.api.PostsApi
import task5.data.remote.dto.PostDto
import task5.data.remote.dto.ResponseDto
import javax.inject.Inject

class PostsRemoteImpl @Inject constructor(
    private val postsApi: PostsApi
) : PostsRemote {
    override suspend fun getPosts(): ResponseDto =
        postsApi.getLatestNews()
    }