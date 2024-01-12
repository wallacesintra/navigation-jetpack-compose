package com.example.lunchtray.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lunchtray.R
import com.example.lunchtray.ui.theme.LunchTrayTheme

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    onNextButtonClicked: () -> Unit = {}
){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Button(onClick = onNextButtonClicked) {
            Text(text = stringResource(id = R.string.time_for_lunch))
        }
    }

}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    LunchTrayTheme {
        HomeScreen(modifier = Modifier)
    }
}