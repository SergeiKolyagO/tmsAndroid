package task5.di.module.repositories

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import task5.data.repositories.PostsRepositoryImpl
import task5.data.repositories.remote.PostsRemote
import task5.domain.repository.PostsRepository

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    fun providePostsRepository(postsRemote: PostsRemote) : PostsRepository =
        PostsRepositoryImpl(postsRemote = postsRemote)
}