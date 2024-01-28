package com.azharkova.test_kmm.threads

import kotlinx.coroutines.CoroutineDispatcher

expect val uiDispatcher: CoroutineDispatcher
expect val ioDispatcher: CoroutineDispatcher