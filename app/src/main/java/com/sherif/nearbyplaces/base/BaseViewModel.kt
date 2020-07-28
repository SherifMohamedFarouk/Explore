package com.sherif.nearbyplaces.base

import androidx.lifecycle.ViewModel
import com.sherif.nearbyplaces.injection.component.DaggerViewModelInjector
import com.sherif.nearbyplaces.injection.component.ViewModelInjector
import com.sherif.nearbyplaces.injection.module.NetworkModule
import com.sherif.nearbyplaces.ui.explore.ExploreListViewModel

abstract class BaseViewModel :ViewModel(){

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    private fun inject() {
        when (this) {
            is ExploreListViewModel -> injector.inject(this)

        }
    }

}