package com.example.basemvvm.data.model

import com.google.gson.annotations.SerializedName

class ApiObjectResponse<T> {

    @SerializedName("response")
    var data: T? = null

    @SerializedName("status_message")
    var statusMessage: String? = null

    @SerializedName("status_code")
    var statusCode: Int? = null

    @SerializedName("success")
    var success: Boolean? = true
}