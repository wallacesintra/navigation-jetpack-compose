package com.example.lunchtray.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.lunchtray.R
import com.example.lunchtray.data.Datasource

@Composable
fun SideDishScreen(){
    ScreenLayout(
        title = stringResource(id = R.string.choose_side_dish),
        data = Datasource.SideDish,
        nextButtonClick = { /*TODO*/ },
        cancelButtonClick = {}
    )

}