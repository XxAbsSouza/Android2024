package com.example.criptomonitor.ui.theme.service
import retrofit2.Response
import retrofit2.http.GET
interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}