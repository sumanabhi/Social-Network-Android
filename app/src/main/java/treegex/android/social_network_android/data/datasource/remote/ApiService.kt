package treegex.android.social_network_android.data.datasource.remote


import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import treegex.android.social_network_android.data.model.Response

interface ApiService {

    @FormUrlEncoded
    @POST(ApiURL.GENERATE_USER)
    suspend fun generateUser(@Field("phone") phone: String): Response

}