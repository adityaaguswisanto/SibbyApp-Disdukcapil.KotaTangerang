package com.sibbya.sibbya.data.responses.news

import com.sibbya.sibbya.data.responses.data.Link
import com.sibbya.sibbya.data.responses.data.News

data class NewsResponse(
    val current_page: Int,
    val `data`: List<News>,
    val first_page_url: String,
    val from: Int,
    val last_page: Int,
    val last_page_url: String,
    val links: List<Link>,
    val next_page_url: Any,
    val path: String,
    val per_page: Int,
    val prev_page_url: Any,
    val to: Int,
    val total: Int
)