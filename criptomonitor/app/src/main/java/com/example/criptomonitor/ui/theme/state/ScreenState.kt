package com.example.criptomonitor.ui.theme.state

import com.example.criptomonitor.ui.theme.service.Ticker


sealed class ScreenState {

    object Loading : ScreenState() //se conecta com o load da activitymain para rodar enquando faz conexão com a api
    data class Success(val data: Ticker) : ScreenState()
    data class Error(val exception: Throwable) : ScreenState()
}