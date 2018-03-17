package com.example.carloscaldas.mkprojeto.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by adriano.leite on 16/03/2018.
 */

interface MkREST {
    @GET("/mksys/{tipo}")
fun getCliente(@Path("tipo") tipo: String): Call<List<Cliente>>
}