package com.sherif.nearbyplaces.network

import com.sherif.nearbyplaces.model.photos.GetPhotos
import com.sherif.nearbyplaces.model.place.PlaceModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NearbyApi {
    @GET("explore?&v=20180323&limit=10&radius=1000")
    fun getLocations(@Query("client_id")client_id : String,@Query("client_secret")client_secret : String,
                     @Query("ll")lnglat : String):Observable<PlaceModel>

    @GET("{id}/photos?&v=20180323")
    fun getPhotos(@Path("id")id:String ,@Query("client_id")client_id:String,
                  @Query("client_secret")client_secret:String):Observable<GetPhotos>


}

