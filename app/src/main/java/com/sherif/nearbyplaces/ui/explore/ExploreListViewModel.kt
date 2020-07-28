package com.sherif.nearbyplaces.ui.explore

import android.util.Log
import com.sherif.nearbyplaces.R
import com.sherif.nearbyplaces.base.BaseViewModel
import com.sherif.nearbyplaces.network.NearbyApi
import com.sherif.nearbyplaces.utils.CLIENT_ID
import com.sherif.nearbyplaces.utils.CLIENT_SECRET
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class ExploreListViewModel() :BaseViewModel(){
  @Inject
  lateinit var nearbyApi: NearbyApi
  private lateinit var subscription: Disposable

  init {
    loadPlaces()
  }
  fun loadPlaces(){
    subscription = nearbyApi.getLocations(CLIENT_ID, CLIENT_SECRET,"40.7243,-74.0018")
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .doOnSubscribe{}
      .doOnTerminate{}
      .subscribe(
        {result ->
          Log.v("placeResult", result.toString())}
        ,{Log.v("placeResult", R.string.post_error.toString())}
      )
  }


  override fun onCleared() {
    super.onCleared()
    subscription.dispose()
  }
  }
