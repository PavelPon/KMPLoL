package com.azharkova.test_kmm.di

import com.azharkova.test_kmm.data.usecase.ChampionUseCase
import com.azharkova.test_kmm.data.viewmodel.ChampionsViewModel
import com.azharkova.test_kmm.network.NetworkClient
import com.azharkova.test_kmm.service.ChampionService
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin
import org.koin.dsl.module
import kotlin.reflect.KClass

class KoinDI : KoinComponent {
    val serviceModule = module {
        single { NetworkClient() }
        single { ChampionService(get()) }
    }

    val usecaseModule = module {
        factory {
            ChampionUseCase(get())
        }
    }

    val vmModule = module {
        factory<ChampionsViewModel> { ChampionsViewModel(get()) }
    }

    fun start() = startKoin {
        modules(listOf(serviceModule, usecaseModule, vmModule))
    }
}

object KoinDIFactory {
    val di by lazy {
        KoinDI().apply {
            start()
        }
    }
}

fun<T:Any> KoinDIFactory.resolve(clazz: KClass<*>):T? {
    return di.getKoin().get(clazz)
}