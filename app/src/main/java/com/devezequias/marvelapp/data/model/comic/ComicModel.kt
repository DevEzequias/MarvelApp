package com.devezequias.marvelapp.data.model.comic

import com.devezequias.marvelapp.data.ThumbnailModel
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ComicModel(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("thumbnail")
    val thumbnail: ThumbnailModel
): Serializable
