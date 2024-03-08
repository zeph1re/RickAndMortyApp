package com.example.rickandmortyapp.ui.home

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.rickandmortyapp.R
import com.example.rickandmortyapp.ui.theme.RickAndMortyAppTheme


@Composable
fun DetailScreen() {

    DetailScreenContent()

}

@Preview(showSystemUi = true)
@Composable
fun DetailScreenContent() {

    Column(
        modifier = Modifier.padding(16.dp)
            .fillMaxWidth()
    ) {
        //header
        Box(
            modifier = Modifier.padding(vertical = 16.dp)
                .fillMaxWidth()
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box() {
                    Image(
                        painter = painterResource(id = R.drawable.profile_picture),
                        contentDescription = "Profile Picture"
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Column (
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(text = "Character Name")
                    Text(text = "Character Status")
                }

            }

        }
        //end of header
        Spacer(modifier = Modifier.height(32.dp))
        //description
        Box {
            Column {
                Text(text = "Gender")
                Text(text = "Status")
                Text(text = "Species")
                Text(text = "Type")
            }
        }
        //end of descrption





    }
    //button
    Box(
        contentAlignment = Alignment.BottomCenter
    ) {
        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.padding(horizontal = 16.dp)
                .fillMaxWidth()

        ) {
            Text(text = "Add to Location")
        }

    }

}




