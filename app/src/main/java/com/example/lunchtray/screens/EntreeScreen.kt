package com.example.lunchtray.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.lunchtray.R
import com.example.lunchtray.data.Datasource
import com.example.lunchtray.ui.theme.LunchTrayTheme

@Composable
fun EntreeScreen(){
    ScreenLayout(
        title = stringResource(id = R.string.choose_entree),
        data = Datasource.Entree,
        nextButtonClick = {},
        cancelButtonClick = {}
    )
}

@Preview(showBackground = true)
@Composable
fun EntreeScreenPreview(){
    LunchTrayTheme {
        EntreeScreen()
    }
}