package treegex.android.social_network_android.data.datasource.remote

object ApiURL {
    const val BASE_URL = "http://192.168.1.105:3000/"

    private const val BASE_ENDPOINT_FOR_AUTH = "api/auth"
    private const val BASE_ENDPOINT_FOR_VERIFY_IN_AUTH_ROUTE = "${BASE_ENDPOINT_FOR_AUTH}/verify"
    const val GENERATE_USER = "${BASE_ENDPOINT_FOR_AUTH}/generate/user"
    const val REFRESH_TOKEN = "${BASE_ENDPOINT_FOR_AUTH}/refresh/token"
    const val VERIFY_AUTH_CODE = "${BASE_ENDPOINT_FOR_VERIFY_IN_AUTH_ROUTE}/authCode"
    const val VERIFY_TWO_STEP = "${BASE_ENDPOINT_FOR_VERIFY_IN_AUTH_ROUTE}/twoStep"


}