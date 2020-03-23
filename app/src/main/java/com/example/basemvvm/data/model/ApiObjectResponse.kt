package com.example.basemvvm.data.model

import com.google.gson.annotations.SerializedName

class ApiObjectResponse<T> {
    @SerializedName("status")
    var success: Int = 0

    @SerializedName("response")
    var data: T? = null

    @SerializedName("error_message")
    var errorMessage: String? = null

    @SerializedName("error_code")
    var errorCode: String? = null
}