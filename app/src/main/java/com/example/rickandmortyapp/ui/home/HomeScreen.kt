package com.example.rickandmortyapp.ui.home

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.rickandmortyapp.R
import com.example.rickandmortyapp.models.Character
import com.example.rickandmortyapp.ui.common_use.AppCard


@Composable
fun HomeScreen(
    viewModel: HomeViewModel,
) {

    val characterData by viewModel.characterData.observeAsState(listOf())

    LaunchedEffect(viewModel) {
        viewModel.getCharacter()
    }


    Column(
        modifier = Modifier.padding(
            horizontal = 16.dp,
            vertical = 32.dp
        ),
    )
    {
        //title
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Rick And Morty's App",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        //end of title

        Spacer(modifier = Modifier.height(16.dp))

        //header
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .size(50.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile_picture),
                    contentDescription = "Profile Picture"
                )
            }
            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(
                    text = "Hello There",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(
                    text = "Welcome to the App",
                    style = TextStyle(
                        fontSize = 13.sp
                    )
                )
            }
        }
        //end of header

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Character List",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        )

        if (characterData.isEmpty()) {
            Text(text = "Loading...")
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(vertical = 16.dp)
            ) {
                items(characterData) {data ->

                    CharacterItem(data = data)
                }
            }
        }




    }
}



@Composable
fun CharacterItem(data : Character) {
    AppCard(
        name = data.name,
        imageUrl = data.imageUrl,
        status = data.status,
        gender = data.gender,
        species = data.species) {


    }
}










