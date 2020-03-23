package com.example.basemvvm.data.model

import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("id")
    var id: Int,

    @SerializedName("name")
    var name: String,

    @SerializedName("slug")
    var slug: String,

    @SerializedName("parent_id")
    var parentId: Int?,

    @SerializedName("created_at")
    var createAt: String?,

    @SerializedName("updated_at")
    var updateAt: String?
) {

}