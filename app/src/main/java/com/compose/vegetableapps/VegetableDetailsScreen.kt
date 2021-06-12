package com.compose.vegetableapps

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun VegetableDetailsScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        VegetableDetailsHeader()
        VegetableDetailsBody()
    }
}


@Composable
fun VegetableDetailsHeader(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(300.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.brokoli),
            contentDescription = null,
            modifier = modifier
                .fillMaxSize()
        )
        Surface(
            modifier = modifier
                .width(64.dp)
                .height(64.dp)
                .padding(dimensionResource(id = R.dimen.spacing_4)),
            shape = CircleShape,
            color = Color.LightGray,
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                tint = Color.White,
            )
        }
    }
}

@Composable
fun VegetableDetailsBody(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxSize(),
        elevation = dimensionResource(id = R.dimen.elevation_2),
        shape = RoundedCornerShape(
            topStart = dimensionResource(id = R.dimen.corner_radius_4),
            topEnd = dimensionResource(id = R.dimen.corner_radius_4)
        ),
    ) {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(dimensionResource(id = R.dimen.spacing_4))
        ) {
            Text(
                text = "Brokoli",
                style = MaterialTheme.typography.h5,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = modifier.height(dimensionResource(id = R.dimen.spacing_1)))
            Text(
                text = "Brokoli",
                style = MaterialTheme.typography.subtitle1,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic
            )
            Spacer(modifier = modifier.height(dimensionResource(id = R.dimen.spacing_2)))
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam malesuada odio sem, et pulvinar eros tempor ac. Phasellus suscipit rhoncus est, sit amet interdum est porttitor ut. In et felis sed mi sollicitudin convallis sed placerat metus. Morbi odio magna, interdum vel volutpat in, blandit eu justo.",
                style = MaterialTheme.typography.body2,
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DetailsHeaderPreview() {
    VegetableDetailsHeader()
}

@Preview(showBackground = true)
@Composable
fun DetailsBodyPreview() {
    VegetableDetailsBody()
}