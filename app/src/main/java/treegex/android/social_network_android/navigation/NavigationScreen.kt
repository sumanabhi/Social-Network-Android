package treegex.android.social_network_android.navigation


sealed class NavigationScreen(val route: String) {
    object Home : NavigationScreen(route = "Home")
    object InputPhoneNumber : NavigationScreen(route = "InputPhoneNumber")
    object AuthCode : NavigationScreen(route = "AuthCode")
}