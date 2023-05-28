package task5.data.remote.dto

import com.google.gson.annotations.SerializedName
import task5.domain.models.ListPost
import task5.domain.models.Post

data class PostDto(
    @SerializedName("title")
    val title: String,

    @SerializedName("description")
    val description: String,

    @SerializedName("url")
    val url: String,

    @SerializedName("urlToImage")
    val urlToImage: String,

    @SerializedName("publishedAt")
    val publishedAt: String
)
//fun PostDto.toPost() : Post {
//    return Post(
//        id = id,
//        title = title,
//        description = description
//    )
//}
//fun List<PostDto>.toDomainPostList() =
//    ListPost(
//        this.map {
//            it.toPost()
//        }
//    )
    fun PostDto.toDomainPost() =
    Post(
        title = title,
        description = description,
        url = url,
        urlToImage = urlToImage,
        publishedAt = publishedAt
    )