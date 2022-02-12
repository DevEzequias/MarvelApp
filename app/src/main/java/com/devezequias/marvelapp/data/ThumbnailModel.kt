package com.devezequias.marvelapp.data

import com.google.gson.annotations.SerializedName

data class ThumbnailModel(
    @SerializedName("path")
    val path: String,
    @SerializedName("extension")
    val extension: String,
)
