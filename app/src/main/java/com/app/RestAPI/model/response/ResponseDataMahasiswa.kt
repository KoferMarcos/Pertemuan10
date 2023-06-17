package com.app.RestAPI.model.response


import com.app.RestAPI.model.request.DataAllMahasiswa
import com.google.gson.annotations.SerializedName

data class ResponseDataMahasiswa(
    @SerializedName("data")
    val data: List<DataAllMahasiswa>,
    @SerializedName("status")
    val status: String
)