package treegex.android.social_network_android.ui.screens.auth.phone


import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import treegex.android.social_network_android.R
import treegex.android.social_network_android.navigation.NavigationScreen
import treegex.android.social_network_android.ui.components.EditText
import treegex.android.social_network_android.ui.components.GoButton

@OptIn(ExperimentalCoroutinesApi::class, FlowPreview::class)
@Composable
fun InputPhoneNumber(navController: NavController) {
    val phoneNumber = remember { mutableStateOf("") }
    val inputPhoneNumberViewModel = hiltViewModel<InputPhoneNumberViewModel>()
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        EditText(phoneNumber, R.string.Phone_Number)
        GoButton(navController = navController,
            onClick = {

//                navController.navigate(route = NavigationScreen.AuthCode.route)
                inputPhoneNumberViewModel.generateUser(phoneNumber.value)
                Log.e("ALIAZmo", inputPhoneNumberViewModel.responseGenerateUser.value.toString())
            })
    }
}


@Composable
@Preview(showBackground = true)
fun InputPhoneNumberPreview() {

    InputPhoneNumber(
        rememberNavController()
    )
}