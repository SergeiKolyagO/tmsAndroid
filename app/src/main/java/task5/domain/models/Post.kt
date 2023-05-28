package task5.domain.models

data class Post (
    // обработать null обязательно! не дать упасть приложению
    val title: String? = "",
    val description: String? = "",
    val url: String? = "",
    val urlToImage: String? = "",
    val publishedAt: String? = ""
)