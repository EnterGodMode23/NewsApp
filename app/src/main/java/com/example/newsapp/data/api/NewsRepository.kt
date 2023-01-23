package com.example.newsapp.data.api

import androidx.room.Query
import javax.inject.Inject

class NewsRepository @Inject constructor(private val newsService: NewsService) {

    suspend fun getNews(countryCode: String, pageNumper: Int) =
        newsService.getHeadlines(countryCode = countryCode, page = pageNumper)


    suspend fun getSearchNews(query: String, pageNumper: Int) =
        newsService.getEverything(query = query, page = pageNumper)

}