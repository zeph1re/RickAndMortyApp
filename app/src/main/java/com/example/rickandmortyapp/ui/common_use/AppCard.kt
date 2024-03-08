package com.example.rickandmortyapp.ui.common_use

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.rickandmortyapp.ui.home.HomeViewModel

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun AppCard(
    name : String,
    imageUrl: String,
    status : String,
    gender : String,
    species : String,
    onClick : () -> Unit
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .wrapContentHeight(),
        border = BorderStroke(
            width = 1.dp, brush = Brush.horizontalGradient(
                colors = listOf(
                    MaterialTheme.colorScheme.inversePrimary,
                    MaterialTheme.colorScheme.primaryContainer
                )
            )
        ),
        shape = RoundedCornerShape(16.dp),
//        elevation = CardElevation(10.dp),

    ) {
        Box(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .fillMaxWidth(),

            ) {
            Row {
                GlideImage(
                    model = imageUrl,
                    contentDescription = "character photo",
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxHeight(),
                )
                Column {
                    Text(text = name)
                    Text(text = gender)
                    Text(text = status)
                    Text(text = species)

                }
            }
        }
    }

}