package com.example.iqbaalrafi

import android.app.Application
import com.example.iqbaalrafi.di.repositoryModule
import com.example.iqbaalrafi.di.roomModule
import com.example.iqbaalrafi.di.viewModelModule
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            androidContext(this@App)
            modules(listOf(
                roomModule,
                repositoryModule,
                viewModelModule

            ))
        }
    }
}