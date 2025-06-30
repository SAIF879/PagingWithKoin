package com.example.pagingwithkoin

import android.app.Application
import com.example.pagingwithkoin.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class PagingApplication  : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@PagingApplication)
            module {
                appModule
            }
        }
    }
}