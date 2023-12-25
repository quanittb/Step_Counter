package com.mobiai.app.ui.activity


import android.util.Log
import com.mobiai.R
import com.mobiai.base.basecode.storage.SharedPreferenceUtils
import com.mobiai.base.basecode.ui.activity.splash.BaseSplashActivity
import com.mobiai.databinding.ActivitySplashBinding

class SplashActivity() : BaseSplashActivity<ActivitySplashBinding>() {

    override fun getLayoutResourceId(): Int  = R.layout.activity_splash

    override fun getViewBinding(): ActivitySplashBinding = ActivitySplashBinding.inflate(layoutInflater)
    override fun createView() {
        openNextScreen()
    }

    override fun openNextScreen() {
        if (SharedPreferenceUtils.languageCode == null) {
            LanguageActivity.start(this, true)
        }  else {
            MainActivity.startMain(this, true)
        }
    }
}