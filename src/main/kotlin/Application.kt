package com.br

import com.br.plugins.configureHttp
import com.br.plugins.configureMonitoring
import com.br.plugins.configureRouting
import com.br.plugins.configureSecurity
import com.br.plugins.configureSerialization
import com.br.plugins.configureWebsockets
import io.ktor.server.application.Application
import io.ktor.server.netty.EngineMain

fun main(args: Array<String>) {
    EngineMain.main(args)
}


fun Application.module() {
    configureWebsockets()
    configureSerialization()
    configureMonitoring()
    configureHttp()
    configureSecurity()
    configureRouting()
}