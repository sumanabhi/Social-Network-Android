package treegex.android.social_network_android.ui.components

import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import treegex.android.social_network_android.R
import treegex.android.social_network_android.ui.theme.Blue_400

@Composable
fun GoButton(onClick: () -> Unit, navController: NavController) {
    Row(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.End,
    ) {
        Button(colors = ButtonDefaults.outlinedButtonColors(Blue_400), onClick = onClick) {
            Image(
                painter = painterResource(id = R.drawable.ic_arrow_forward),
                contentDescription = stringResource(id = R.string.arrow_forward)
            )

        }
    }
}

@Composable
fun EditText(data: MutableState<String>, @StringRes label: Int) {
    OutlinedTextField(
        value = data.value,
        onValueChange = { data.value = it },
        label = {
            Text(
                text = stringResource(label),
                style = TextStyle(
                    color = Blue_400
                )
            )
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            unfocusedBorderColor = Blue_400
        )
    )
}