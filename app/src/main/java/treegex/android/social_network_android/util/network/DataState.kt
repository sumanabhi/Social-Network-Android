package treegex.android.social_network_android.util.network


sealed class DataState<out R> {
    data class Success<out T>(val data: T) : DataState<T>()
}