package task5.di.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import task5.domain.repository.PostsRepository
import task5.domain.use_cases.GetPostInfoUseCase
import task5.domain.use_cases.PostsUseCase

@Module
@InstallIn(SingletonComponent::class)
class UseCasesModule {
    @Provides
    fun providePostInfoUseCase(postsRepository: PostsRepository) =
        GetPostInfoUseCase(postsRepository = postsRepository)
    @Provides
    fun providePostsUseCase(postsRepository: PostsRepository)=
        PostsUseCase(postsRepository = postsRepository)
}