package com.azharkova.test_kmm.data.usecase

import com.azharkova.test_kmm.service.ChampionService
import io.ktor.client.request.forms.formData
import org.openapitools.loldictionarykmp.models.ChampionObj
import org.openapitools.loldictionarykmp.models.ChampionsAllData
import org.openapitools.loldictionarykmp.models.ChampionsList

class ChampionUseCase(private var championService: ChampionService) :
    BaseUseCase<Unit, ArrayList<ChampionObj>?>() {
    override suspend fun execute(param: Unit): ArrayList<ChampionObj>? {
        val listChampions = ArrayList<ChampionObj>()
        val response = championService.loadData()
        val data = response.getOrNull()?.data
        if (data != null) {
            listChampions.add(data.aatrox)
            listChampions.add(data.ahri)
            listChampions.add(data.akali)
            listChampions.add(data.akshan)
            listChampions.add(data.caitlyn)
            listChampions.add(data.darius)
            listChampions.add(data.galio)
            listChampions.add(data.janna)
            listChampions.add(data.rakan)
            listChampions.add(data.bard)
            listChampions.add(data.taliyah)
            listChampions.add(data.hecarim)
            listChampions.add(data.samira)
            listChampions.add(data.sejuani)
            listChampions.add(data.senna)
            listChampions.add(data.shaco)
            listChampions.add(data.sett)
            listChampions.add(data.singed)
        }

        return try {
            listChampions
        } catch (e: Exception) {
            throw e
        }
    }
}