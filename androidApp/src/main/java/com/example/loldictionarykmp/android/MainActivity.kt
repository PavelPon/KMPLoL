package com.example.loldictionarykmp.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.azharkova.kmm_news.android.ui.NewsListScreen
import com.azharkova.test_kmm.data.viewmodel.ChampionsViewModel
import com.azharkova.test_kmm.di.KoinDIFactory
import com.azharkova.test_kmm.di.resolve


class MainActivity : ComponentActivity() {
    private val vm: ChampionsViewModel? = KoinDIFactory.resolve(ChampionsViewModel::class)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        setContent {
            vm?.let {
                NewsListScreen(viewModel = vm)
            }
        }

    }

}

