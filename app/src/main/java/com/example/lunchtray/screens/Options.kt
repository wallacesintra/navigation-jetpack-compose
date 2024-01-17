package com.example.lunchtray.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lunchtray.R
import com.example.lunchtray.data.Datasource
import com.example.lunchtray.data.Options
import com.example.lunchtray.ui.theme.LunchTrayTheme

@Composable
fun OptionsItem(
    modifier: Modifier = Modifier,
    option: Options,
    onClick: () -> Unit
){
    
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(5.dp)
    ) {
        RadioButton(
            selected = option.selected,
            onClick = onClick
        )
        Column {
            Text(
                text = option.name,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(vertical = 5.dp)
            )
            Text(
                text = option.description,
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                text = stringResource(id = R.string.price, option.price),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(vertical = 5.dp)
            )
        }
    }
}

@Composable
fun OptionLayout(
    modifier: Modifier = Modifier,
    optionsList: List<Options>
){
    LazyColumn(){
        items(optionsList){option ->
            OptionsItem(
                option = option,
                onClick = {

                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OptionScreenPreview(){
    LunchTrayTheme {
        OptionLayout(optionsList = Datasource.Entree)
    }
}