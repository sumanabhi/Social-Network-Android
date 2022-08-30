package treegex.android.social_network_android.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import treegex.android.social_network_android.navigation.Navigation
import treegex.android.social_network_android.ui.theme.SocialNetworkAndroidTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            SocialNetworkAndroidTheme {
                val navController: NavHostController = rememberNavController()
                Navigation(navController = navController)
            }


        }

    }

}