package com.example.lunchtray.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.lunchtray.R
import com.example.lunchtray.data.Datasource

@Composable
fun AccompanimentScreen(){
    ScreenLayout(
        title = stringResource(id = R.string.choose_accompaniment),
        data = Datasource.Accompaniment,
        nextButtonClick = {},
        cancelButtonClick = {}
    )

}