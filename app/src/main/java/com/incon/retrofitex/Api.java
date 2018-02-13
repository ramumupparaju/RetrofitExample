package com.incon.retrofitex;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by PC on 2/12/2018.
 */

public interface Api {

    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
