package com.example.responsiveui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val posts = listOf(
            VideoPost(
                avatarRes = R.drawable.avatar_marcy,
                channelName = "Shrek",
                source = "from YouTube · 163.5k views",
                title = "Обещаю работать на результат",
                thumbnailRes = R.drawable.thumbnail_shrek,
                category = "Mashups",
                tag1 = "#shrek",
                tag2 = "#dreamworks",
                likeCount = "112",
                repostCount = "18"
            ),
            VideoPost(
                avatarRes = R.drawable.avatar_marcy,
                channelName = "Shrek",
                source = "from YouTube · 84.2k views",
                title = "Суровая повесточка в фильмах⁠",
                thumbnailRes = R.drawable.thumbnail_screen2,
                category = "Cinematic",
                tag1 = "#shrek2",
                tag2 = "#fairytale",
                likeCount = "340",
                repostCount = "57"
            ),
            VideoPost(
                avatarRes = R.drawable.avatar_marcy,
                channelName = "Shrek",
                source = "from YouTube · 21.8k views",
                title = "Дальше, дальше — туда, где нет людей",
                thumbnailRes = R.drawable.thumbnail_screen3,
                category = "Quotes",
                tag1 = "#shrek3",
                tag2 = "#animated",
                likeCount = "98",
                repostCount = "11"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = VideoPostAdapter(posts)
    }
}
