package com.example.composecustomshapes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composecustomshapes.ui.theme.ComposeCustomShapesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeCustomShapesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeTriangleShapeDemo(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeTriangleShapeDemo(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier
            .size(200.dp)
            .clip(TriangleShape),
        contentScale = ContentScale.Crop,
        painter = painterResource(id = R.drawable.image),
        contentDescription = null,
    )
}

@Composable
fun ComposeStarShapeDemo(modifier: Modifier = Modifier) {
    Image(
        modifier = modifier
            .size(200.dp)
            .clip(StarShape),
        contentScale = ContentScale.Crop,
        painter = painterResource(id = R.drawable.image),
        contentDescription = null,
    )
}

@Preview
@Composable
private fun ComposeTriangleShapeDemoPreview() {
    ComposeCustomShapesTheme {
        ComposeTriangleShapeDemo()
    }
}

@Preview
@Composable
private fun ComposeStarShapeDemoPreview() {
    ComposeCustomShapesTheme {
        ComposeStarShapeDemo()
    }
}