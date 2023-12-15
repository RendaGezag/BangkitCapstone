package com.example.educasea.ui.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
data class Biota(
    var id: String,
    var name: String,
    var description: String,
    var imageUrl: String,
    var audio: String
)

const val BASE_URL = "https://educasea-authlogin-default-rtdb.asia-southeast1.firebasedatabase.app/"

interface APIService {
    @GET("seaBiota.json")
    suspend fun getBiotas(): List<Biota>

    companion object {
        private var apiService: APIService? = null
        fun getInstance(): APIService {
            if (apiService == null) {
                apiService = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(APIService::class.java)
            }
            return apiService!!
        }
    }
}
