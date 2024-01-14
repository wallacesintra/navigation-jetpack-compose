package com.example.lunchtray.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.lunchtray.R
import com.example.lunchtray.data.Datasource
import com.example.lunchtray.data.Options

@Composable
fun ScreenLayout(
    modifier: Modifier = Modifier,
    title: String,
    data: List<Options>,
    nextButtonClick: () -> Unit,
    cancelButtonClick: () -> Unit
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(10.dp)
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.titleLarge
        )
//        OptionLayout(optionsList = Datasource.SideDish)
        OptionLayout(optionsList = data)
        TwoButton(
            onCancelButtonClicked = nextButtonClick,
            onNextButtonClicked = cancelButtonClick
        )
    }

}

@Composable
fun TwoButton(
    modifier: Modifier = Modifier,
    onCancelButtonClicked: () -> Unit,
    onNextButtonClicked: () -> Unit
){
    Row (
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        modifier = Modifier
            .padding(30.dp)
            .fillMaxWidth()
    ){
        OutlinedButton(
            onClick = onCancelButtonClicked,
            modifier = Modifier.weight(1f)
        ) {
            Text(text = stringResource(id = R.string.cancel))
        }
        Button(
            onClick = onNextButtonClicked,
            modifier = Modifier.weight(1f)
        ) {
            Text(text = stringResource(id = R.string.next))
        }
    }
}