package task5.domain.models

data class Post (
    // обработать null обязательно! не дать упасть приложению
    val id: Int? = 0,
    val title: String? = "",
    val description: String? = ""
        )