package com.example.rickandmortyapp.ui.character_by_location

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun LocationScreen() {

//    if (data.isEmpty()) {
//        Text(text = "Loading...")
//    } else {
//        LazyColumn(
//            modifier = Modifier
//                .fillMaxHeight()
//                .padding(vertical = 16.dp)
//        ) {
//            items(characterData) {data ->
//
//                LocationItem(data = data)
//            }
//        }
//    }

}



@Composable
fun LocationItem() {
    Card {
        Column {
            Text(text = "Location Name")
            Text(text = "Location Dimension")
        }
    }
}


