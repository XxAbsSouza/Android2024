package com.example.criptomonitor.ui.theme.service

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CryptoService {

    @GET("api/{coin}/ticker")
    suspend fun fetchCoinTicker(@Path("coin") coin: String = "BTC"): Response<TickerResponse>
} //suspend diz para o retrofit que a conexão é async