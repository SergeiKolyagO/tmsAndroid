package task5.data.remote.dto

import task5.domain.models.ListPost
import task5.domain.models.Post

data class PostDto(
    val id: Int,
    val title: String? = null,
    val description: String? = null
)
fun PostDto.toPost() : Post {
    return Post(
        id = id,
        title = title,
        description = description
    )
}
fun List<PostDto>.toDomainPostList() =
    ListPost(
        this.map {
            it.toPost()
        }
    )