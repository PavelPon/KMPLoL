package com.azharkova.test_kmm.threads

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

actual val uiDispatcher: CoroutineDispatcher = Dispatchers.Main
actual val ioDispatcher: CoroutineDispatcher = Dispatchers.IO