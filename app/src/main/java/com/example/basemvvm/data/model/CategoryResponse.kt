package com.example.basemvvm.data.model

import com.google.gson.annotations.SerializedName

class CategoryResponse(
    @SerializedName("categories")
    var categories: List<Category>
) {
}