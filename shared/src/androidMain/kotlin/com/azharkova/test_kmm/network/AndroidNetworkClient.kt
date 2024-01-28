package com.azharkova.test_kmm.network

import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.http.*
import io.ktor.http.ContentType.Application.Json
import io.ktor.serialization.kotlinx.json.*
import kotlinx.serialization.json.Json
actual fun createHttpClient(): HttpClient {
    return AndroidClient()
}

fun AndroidClient() = HttpClient(OkHttp) {
    install(ContentNegotiation) {
        json(Json{
            prettyPrint = true
            ignoreUnknownKeys = true
            explicitNulls = true
        })
    }
    install(Logging) {
        logger = Logger.DEFAULT
        level = LogLevel.ALL
    }
}