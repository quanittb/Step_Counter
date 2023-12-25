package com.mobiai.app


import com.ads.control.application.AdsMultiDexApplication
import com.mobiai.base.basecode.storage.SharedPreferencesManager
import com.mobiai.base.basecode.storage.StorageCommon

class App : AdsMultiDexApplication() {

    companion object {
        private var instance: App? = null
        private var storageCommon: StorageCommon? = null

        fun getStorageCommon(): StorageCommon? {
            return storageCommon
        }

        fun getInstance(): App? {
            return instance
        }
        lateinit var instanceSharePreference: SharedPreferencesManager

    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        instanceSharePreference = SharedPreferencesManager(applicationContext)
        storageCommon = StorageCommon()

    }


}