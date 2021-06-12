package com.compose.vegetableapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.compose.vegetableapps.data.DataSource
import com.compose.vegetableapps.data.Vegetable
import com.compose.vegetableapps.ui.theme.VegetableAppsTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            val actions = remember {
                Action(navController = navController)
            }
            VegetableAppsTheme {
                Scaffold { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = Destinations.Home,
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable(Destinations.Home) {
                            Column {
                                VegetableHeader()
                                VegetableList(action = actions.navigateToDetails)
                            }
                        }
                        composable(Destinations.Details) {
                            VegetableDetailsScreen()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun VegetableHeader(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Vegetables",
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.fillMaxWidth()
        )
    }
}

@Composable
fun VegetableList(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel(),
    action: () -> Unit
) {
    val uiState = viewModel.uiState.collectAsState()
    if (uiState.value.loading) {

    } else {
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
        ) {
            itemsIndexed(uiState.value.vegetableCollections) { index, vegetable ->
                VegetableItem(
                    vegetable = vegetable,
                    onItemClick = {
                        //Navigate to details screen
                        action.invoke()
                    }
                )
            }
        }
    }

}

@Composable
fun VegetableItem(
    modifier: Modifier = Modifier,
    vegetable: Vegetable,
    onItemClick: (String) -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(vertical = dimensionResource(id = R.dimen.spacing_1))
            .clickable(
                onClick = {
                    onItemClick.invoke(vegetable.id)
                },
                role = Role.Button
            ),
        elevation = dimensionResource(id = R.dimen.elevation_1),
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(dimensionResource(id = R.dimen.spacing_2))
        ) {
            RoundedImage(id = vegetable.imageResId)
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(
                        start = dimensionResource(id = R.dimen.spacing_2),
                        end = dimensionResource(id = R.dimen.spacing_2)
                    )
            ) {
                Text(
                    modifier = modifier.fillMaxWidth(),
                    text = vegetable.name,
                    style = MaterialTheme.typography.body2
                )
                Text(
                    modifier = modifier.fillMaxWidth(),
                    text = vegetable.latinName,
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    style = MaterialTheme.typography.body2
                )
                Text(
                    modifier = modifier.fillMaxWidth(),
                    text = vegetable.description,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.body2
                )
                Spacer(modifier = modifier.height(dimensionResource(id = R.dimen.spacing_1)))
                Icon(
                    imageVector = Icons.Rounded.FavoriteBorder,
                    contentDescription = "Favorite Icon",
                    modifier = modifier.align(Alignment.End)
                )
            }
        }
    }
}

@Composable
fun RoundedImage(modifier: Modifier = Modifier, id: Int) {
    Image(
        painter = painterResource(id = id),
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = modifier
            .size(84.dp)
            .clip(RoundedCornerShape(dimensionResource(id = R.dimen.spacing_2)))
            .padding(start = dimensionResource(id = R.dimen.spacing_2))
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    VegetableItem(vegetable = DataSource.getData().first(), onItemClick = {})
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    VegetableHeader()
}