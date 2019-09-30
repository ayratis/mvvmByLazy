package github.ayratis.tpvm.di.module

import android.content.Context
import github.ayratis.tpvm.navigation.Router
import toothpick.config.Module

class AppModule(context: Context): Module() {
    init {
        bind(Context::class.java).toInstance(context)

        //navigation
        bind(Router::class.java).toInstance(Router())
    }
}