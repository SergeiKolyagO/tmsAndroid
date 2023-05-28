package task5.data.remote.api

import retrofit2.http.GET
import retrofit2.http.Query
import task5.data.remote.dto.ResponseDto

interface PostsApi {
    companion object{
        const val GET_POSTS_REQUEST = "top-headlines"

        const val SOURCE_PARAM = "sources"
        const val KEY_PARAM = "apiKey"

        const val API_KEY = "0ab11f48e8e14e51bb292cc5a9be4d1e"
        const val SOURCE_CONST = "techcrunch"
    }
    @GET(GET_POSTS_REQUEST)
    suspend fun getLatestNews(
        @Query(SOURCE_PARAM) source: String = SOURCE_CONST,
        @Query(KEY_PARAM) apiKey: String = API_KEY
    ): ResponseDto


}