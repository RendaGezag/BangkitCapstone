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

data class Fish (
    var id: String,
    var name: String,
    var description: String,
    var imageUrl: String,
    var audio: String
)

data class Animal (
    var id: String,
    var name: String,
    var description: String,
    var imageUrl: String,
    var audio: String
)

const val BASE_URL = "https://paling.kencang.id/educasea/api/"

interface BiotaService {
    @GET("seaBiota.json")
    suspend fun getBiotas(): List<Biota>

    companion object {
        private var biotaService: BiotaService? = null
        fun getInstance(): BiotaService {
            if (biotaService == null) {
                biotaService = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(BiotaService::class.java)
            }
            return biotaService!!
        }
    }
}

interface FishService {
    @GET("seaFish.json")
    suspend fun getFishes(): List<Fish>

    companion object {
        private var fishService: FishService? = null
        fun getInstance(): FishService {
            if (fishService == null) {
                fishService = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(FishService::class.java)
            }
            return fishService!!
        }
    }
}

interface AnimalService {
    @GET("seaAnimal.json")
    suspend fun getAnimals(): List<Animal>

    companion object {
        private var animalService: AnimalService? = null
        fun getInstance(): AnimalService {
            if (animalService == null) {
                animalService = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build().create(AnimalService::class.java)
            }
            return animalService!!
        }
    }
}
