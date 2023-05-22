package task5.di.module.repositories

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import task5.data.repositories.remote.PostsRemote
import task5.data.repositories.remote.PostsRemoteImpl


@Module
@InstallIn(SingletonComponent::class)
class RemoteRepositoryModule {
    @Provides
    fun providePostsRemote(): PostsRemote = PostsRemoteImpl()
}