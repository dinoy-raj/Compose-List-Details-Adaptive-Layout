package com.dino.list.news.ui.screens.listing

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dino.list.news.mocks.topTechNewsToday
import com.dino.list.news.ui.screens.listing.components.NewsCard

@Composable
fun ListingScreen(modifier: Modifier = Modifier, selectedId: String, onClick: (id: String) -> Unit) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        item { Spacer(Modifier.height(8.dp)) }

        items(topTechNewsToday, key = {it.id})
        {
            NewsCard(
                article = it,
                isSelected = selectedId == it.id,
                onClick = {onClick(it.id)},
            )
        }

        item { Spacer(Modifier.height(8.dp)) }
    }
}