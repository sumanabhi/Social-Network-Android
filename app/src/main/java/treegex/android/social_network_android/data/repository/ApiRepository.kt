package treegex.android.social_network_android.data.repository

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import treegex.android.social_network_android.data.datasource.remote.ApiService
import treegex.android.social_network_android.data.model.Response
import treegex.android.social_network_android.util.network.DataState
import javax.inject.Inject


class ApiRepository @Inject constructor(
    private val apiService: ApiService
) {

    suspend fun generateUser(phone: String): Flow<DataState<Response>> = flow {
        emit(DataState.Success(apiService.generateUser(phone)))
    }

}