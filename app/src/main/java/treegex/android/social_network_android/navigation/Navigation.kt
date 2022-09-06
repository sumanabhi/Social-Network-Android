package treegex.android.social_network_android.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import treegex.android.social_network_android.ui.screens.auth.AuthCode
import treegex.android.social_network_android.ui.screens.auth.phone.InputPhoneNumber

@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = NavigationScreen.InputPhoneNumber.route) {
        composable(NavigationScreen.InputPhoneNumber.route) {
            InputPhoneNumber(
                navController = navController
            )
        }
        composable(NavigationScreen.AuthCode.route) {
            AuthCode(
                navController = navController
            )
        }
    }
}
