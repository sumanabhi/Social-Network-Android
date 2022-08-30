package treegex.android.social_network_android.ui.screens.auth

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import treegex.android.social_network_android.R
import treegex.android.social_network_android.navigation.NavigationScreen
import treegex.android.social_network_android.ui.components.EditText
import treegex.android.social_network_android.ui.components.GoButton

@Composable
fun AuthCode(navController: NavController) {
    val code = remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        EditText(code, R.string.Auth_Code)
        GoButton(navController = navController, route = NavigationScreen.AuthCode.route)
    }

}


@Composable
@Preview(showBackground = true)
fun AuthCodePreview() {
    AuthCode(
        rememberNavController()
    )
}