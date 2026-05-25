package com.dino.list.news.ui.screens.listing

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dino.list.core.getRandomShape
import com.dino.list.news.mocks.topTechNewsToday
import com.dino.list.news.ui.screens.listing.components.NewsCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListingScreen(
    modifier: Modifier = Modifier,
    selectedId: String,
    isDualPane: Boolean = false,
    onClick: (id: String) -> Unit
) {
    var searchQuery by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    val shape = getRandomShape()

    val filteredNews = remember(searchQuery) {
        if (searchQuery.isEmpty()) {
            topTechNewsToday
        } else {
            topTechNewsToday.filter {
                it.title.contains(searchQuery, ignoreCase = true) ||
                        it.description.contains(searchQuery, ignoreCase = true) ||
                        it.source.name.contains(searchQuery, ignoreCase = true)
            }
        }
    }

    val inputField = @Composable {
        SearchBarDefaults.InputField(
            query = searchQuery,
            onQueryChange = { searchQuery = it },
            onSearch = { expanded = false },
            expanded = expanded,
            onExpandedChange = { expanded = it },
            placeholder = {
                Text(
                    "Search news...",
                    style = MaterialTheme.typography.labelSmall.copy(fontSize = 10.sp),
                    color = MaterialTheme.colorScheme.onSecondaryContainer
                )
            },
            leadingIcon = {
                Icon(
                    Icons.Default.Search,
                    modifier = Modifier.size(18.dp),
                    contentDescription = null,
                    tint = MaterialTheme.colorScheme.onSecondaryContainer
                )
            },
            trailingIcon = {
                if (expanded) {
                    IconButton(onClick = {
                        if (searchQuery.isNotEmpty()) {
                            searchQuery = ""
                        } else {
                            expanded = false
                        }
                    }) {
                        Icon(Icons.Default.Close, contentDescription = null, modifier = Modifier.size(18.dp),)
                    }
                }
            }
        )
    }

    val resultsContent = @Composable {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(filteredNews, key = { it.id }) {
                NewsCard(
                    article = it,
                    isSelected = selectedId == it.id,
                    onClick = {
                        onClick(it.id)
                        expanded = false
                    },
                )
            }
        }
    }

    Column(
        modifier = modifier.fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surfaceVariant),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (isDualPane) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                DockedSearchBar(
                    inputField = inputField,
                    expanded = expanded,
                    onExpandedChange = { expanded = it },
                    content = { resultsContent() }
                )
            }
        } else {
            SearchBar(
                inputField = inputField,
                expanded = expanded,
                onExpandedChange = { expanded = it },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = if (expanded) 0.dp else 16.dp)
                    .padding(top = if (expanded) 0.dp else 8.dp)
                    .padding(bottom = if (expanded) 0.dp else 8.dp),
                content = { resultsContent() }
            )
        }

        if (!expanded) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                item { Spacer(Modifier.height(8.dp)) }

                items(filteredNews, key = { it.id }) {
                    NewsCard(
                        article = it,
                        isSelected = selectedId == it.id,
                        onClick = { onClick(it.id) },
                    )
                }

                item { Spacer(Modifier.height(8.dp)) }
            }
        }
    }
}
