package com.example.cekongkir.api;



import com.example.cekongkir.model.city.ItemCity;
import com.example.cekongkir.model.cost.ItemCost;
import com.example.cekongkir.model.province.ItemProvince;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    // Province
    @GET("province")
    @Headers("key:4fd26705a99547dcb6168028b5f2249e")
    Call<ItemProvince> getProvince ();

    // City
    @GET("city")
    @Headers("key:4fd26705a99547dcb6168028b5f2249e")
    Call<ItemCity> getCity (@Query("province") String province);

    // Cost
    @FormUrlEncoded
    @POST("cost")
    Call<ItemCost> getCost (@Field("key") String Token,
                            @Field("origin") String origin,
                            @Field("destination") String destination,
                            @Field("weight") String weight,
                            @Field("courier") String courier);

}
