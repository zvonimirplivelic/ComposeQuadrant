package com.zvonimirplivelic.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.zvonimirplivelic.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                ComposableQuadrants()
            }
        }
    }
}

@Composable
fun ComposableQuadrants() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            QuadrantCard(
                modifier = Modifier.weight(1f),
                backgroundColor = Color.Green,
                title = stringResource(R.string.text_composable_title),
                description = stringResource(R.string.text_composable_description)
            )
            QuadrantCard(
                modifier = Modifier.weight(1f),
                backgroundColor = Color.Yellow,
                title = stringResource(R.string.image_composable_title),
                description = stringResource(R.string.image_composable_description)
            )
        }
        Row(Modifier.weight(1f)) {
            QuadrantCard(
                modifier = Modifier.weight(1f),
                backgroundColor = Color.Cyan,
                title = stringResource(R.string.row_composable_title),
                description = stringResource(R.string.row_composable_description)
            )
            QuadrantCard(
                modifier = Modifier.weight(1f),
                backgroundColor = Color.LightGray,
                title = stringResource(R.string.column_composable_title),
                description = stringResource(R.string.column_composable_description)
            )
        }
    }
}

@Composable
fun QuadrantCard(
    modifier: Modifier = Modifier,
    backgroundColor: Color,
    title: String,
    description: String
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Center
        )
        Text(
            text = description,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeQuadrantTheme {
        ComposableQuadrants()
    }
}