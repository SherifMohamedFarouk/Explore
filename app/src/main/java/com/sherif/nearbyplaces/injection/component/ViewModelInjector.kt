package com.sherif.nearbyplaces.injection.component

import com.sherif.nearbyplaces.injection.module.NetworkModule
import com.sherif.nearbyplaces.ui.explore.ExploreListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetworkModule::class)])
interface ViewModelInjector {

    fun inject(exploreListVIewModel: ExploreListViewModel)


    @Component.Builder
    interface Builder {
        fun build(): ViewModelInjector

        fun networkModule(networkModule: NetworkModule): Builder
    }



}