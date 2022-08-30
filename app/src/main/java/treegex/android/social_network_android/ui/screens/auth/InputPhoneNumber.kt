package treegex.android.social_network_android.ui.screens.auth


import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
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
fun InputPhoneNumber(navController: NavController) {
    val phoneNumber = remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        EditText(phoneNumber, R.string.Phone_Number)
        GoButton(navController = navController, route = NavigationScreen.AuthCode.route)
    }
}


@Composable
@Preview(showBackground = true)
fun InputPhoneNumberPreview() {

    InputPhoneNumber(
        rememberNavController()
    )
}