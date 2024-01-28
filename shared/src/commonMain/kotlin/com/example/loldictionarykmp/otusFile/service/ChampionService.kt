package com.azharkova.test_kmm.service
import com.azharkova.test_kmm.network.NetworkConfig
import com.azharkova.test_kmm.network.NetworkClient
import com.azharkova.test_kmm.data.NewsList
import org.openapitools.loldictionarykmp.models.ChampionsAllData

class ChampionService(private val httpClient: NetworkClient) {

    suspend fun loadData(): Result<ChampionsAllData> {
        return httpClient.request(URL)
    }

    companion object {
       // val  URL = "https://newsapi.org/v2/everything?q=science&apiKey=${NetworkConfig.apiKey}"
        val  URL = "https://ddragon.leagueoflegends.com/cdn/13.23.1/data/ru_RU/champion.json"
    }
}