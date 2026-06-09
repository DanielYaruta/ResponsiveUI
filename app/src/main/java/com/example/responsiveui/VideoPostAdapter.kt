package com.example.responsiveui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class VideoPostAdapter(private val items: List<VideoPost>) :
    RecyclerView.Adapter<VideoPostAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivAvatar: ShapeableImageView = view.findViewById(R.id.ivAvatar)
        val tvChannelName: TextView = view.findViewById(R.id.tvChannelName)
        val tvSource: TextView = view.findViewById(R.id.tvSource)
        val tvTitle: TextView = view.findViewById(R.id.tvTitle)
        val ivThumbnail: ImageView = view.findViewById(R.id.ivThumbnail)
        val tvCategory: TextView = view.findViewById(R.id.tvCategory)
        val tvTag1: TextView = view.findViewById(R.id.tvTag1)
        val tvTag2: TextView = view.findViewById(R.id.tvTag2)
        val tvLikeCount: TextView = view.findViewById(R.id.tvLikeCount)
        val tvRepostCount: TextView = view.findViewById(R.id.tvRepostCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_video_post, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = items[position]
        holder.ivAvatar.setImageResource(post.avatarRes)
        holder.tvChannelName.text = post.channelName
        holder.tvSource.text = post.source
        holder.tvTitle.text = post.title
        holder.ivThumbnail.setImageResource(post.thumbnailRes)
        holder.tvCategory.text = post.category
        holder.tvTag1.text = post.tag1
        holder.tvTag2.text = post.tag2
        holder.tvLikeCount.text = post.likeCount
        holder.tvRepostCount.text = post.repostCount
    }

    override fun getItemCount() = items.size
}
