package treegex.android.social_network_android.ui.theme

import android.app.Activity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat


private val LightColorPalette = lightColors(
    primary = Blue_400,
    primaryVariant = Blue_400,
    secondary = Blue_400,
    onPrimary = Gray_100,
    secondaryVariant = Blue_400,
    onSecondary = Color.Black
)

@Composable
fun SocialNetworkAndroidTheme(
    content: @Composable () -> Unit
) {
    val colors = LightColorPalette
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = White.toArgb()


            WindowCompat.getInsetsController(window, view)
                .isAppearanceLightStatusBars = true
            WindowCompat.getInsetsController(window, view)
                .isAppearanceLightNavigationBars = true
        }
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}