package com.azharkova.test_kmm.data.viewmodel

import com.azharkova.test_kmm.data.usecase.ChampionUseCase
import com.azharkova.test_kmm.threads.ioDispatcher
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.openapitools.loldictionarykmp.models.ChampionObj

class ChampionsViewModel(private val useCase: ChampionUseCase) : BaseViewModel() {
    var newsFlow = MutableStateFlow<ArrayList<ChampionObj>?>(null)

    fun loadData() {
        scope.launch {
            val result = withContext(ioDispatcher) {
                useCase.invoke(Unit)
            }
            result.getOrNull()?.let {
                newsFlow.tryEmit(it)
            }
        }
    }
}