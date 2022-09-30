package coding.withze.chapterlimakmtiga.network

import coding.withze.chapterlimakmtiga.model.ResponseDatacarItem
import retrofit2.Call
import retrofit2.http.GET

interface RestfulApi {


    @GET("admin/car")
    fun  getAllCar() :Call<List<ResponseDatacarItem>>
}