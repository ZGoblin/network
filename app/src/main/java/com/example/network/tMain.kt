package com.example.network

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

fun main() {
    val retrofit = Retrofit
        .Builder()
        .baseUrl("https://cat-fact.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: CatFactsService = retrofit.create(CatFactsService::class.java)
    service.getFacts().enqueue(object : Callback<MutableList<CatFact>> {
        override fun onResponse(
            call: Call<MutableList<CatFact>>,
            response: Response<MutableList<CatFact>>
        ) {
            val catFacts = response.body() as MutableList<CatFact>
            for (facts in catFacts) {
                println(facts)
            }
        }
        override fun onFailure(call: Call<MutableList<CatFact>>, t: Throwable) {
            println("Something went wrong")
            println(t)
        }
    })
}

interface CatFactsService {
    @GET("/facts/")
    fun getFacts(): Call<MutableList<CatFact>>
}