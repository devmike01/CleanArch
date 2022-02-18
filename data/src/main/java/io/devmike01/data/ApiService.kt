package io.devmike01.data

import retrofit2.http.GET

interface ApiService {
    @GET("/share/")
    fun getSharingDetail() : Flow
}