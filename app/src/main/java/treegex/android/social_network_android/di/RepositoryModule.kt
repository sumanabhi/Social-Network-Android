package treegex.android.social_network_android.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import treegex.android.social_network_android.data.datasource.remote.ApiService
import treegex.android.social_network_android.data.repository.ApiRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideApiRepository(
        apiService: ApiService,
    ): ApiRepository {
        return ApiRepository(
            apiService
        )
    }

}