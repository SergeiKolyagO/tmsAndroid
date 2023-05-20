package task5.data.repositories.remote

import task5.data.remote.dto.PostDto

class PostsRemoteImpl : PostsRemote {
    override fun getPosts(): List<PostDto> =
        mutableListOf(
            PostDto(
                id = 1,
                title = "Бульбазавр",
                description = "Bulbasaur"
            ),
            PostDto(
                id = 2,
                title = "Мяут",
                description = "Meowth"
            ),
            PostDto(
                id = 3,
                title = "Чармандер",
                description = "Charmander"
            ),
            PostDto(
                id = 4,
                title = "Гипно",
                description = "Hypno"
            ),
            PostDto(
                id = 5,
                title = "Коффинг",
                description = "Koffing"
            ),
            PostDto(
                id = 6,
                title = "Старми",
                description = "Starmie"
            ),
            PostDto(
                id = 6,
                title = "Парас",
                description = "Paras"
            ),
            PostDto(
                id = 7,
                title = "Голем",
                description = "Golem"
            ),
            PostDto(
                id = 8,
                title = "Поливирл",
                description = "Poliwhirl"
            ),
            PostDto(
                id = 9,
                title = "Пикачу",
                description = "Pikachu"
            ),
            PostDto(
                id = 10,
                title = "Слоупок",
                description = "Slowpoke"
            ),
            PostDto(
                id = 11,
                title = "Сквиртл",
                description = "Squirtle"
            ),
            PostDto(
                id = 12,
                title = "Катерпи",
                description = "Caterpie"
            ),
            PostDto(
                id = 13,
                title = "Пиджи",
                description = "Pidgey"
            ),
            PostDto(
                id = 14,
                title = "Видл",
                description = "Weedle"
            )
        )

    override fun getPostInfo(): PostDto =
        PostDto(
            id = 1,
            title = "Бульбазавр",
            description = "Bulbasaur"
        )
}