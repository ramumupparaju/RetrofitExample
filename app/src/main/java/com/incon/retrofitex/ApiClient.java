package com.incon.retrofitex;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.LazyHeaders;
import com.bumptech.glide.request.RequestOptions;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * Created by PC on 2/13/2018.
 */

public class ApiClient {

    public static final String BASE_URL = "https://simplifiedcoding.net/demos/";

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }



/*    public static void loadImageFromApi(ImageView imageView, String url) {
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.placeholder(R.drawable.ic_launcher_background);
        requestOptions.error(R.drawable.ic_launcher_background);

        Context context = imageView.getContext();
        GlideUrl glideUrl = new GlideUrl(BuildConfig.SERVICE_ENDPOINT + url, new LazyHeaders.Builder()
                .build());

        Glide.with(context)
                .setDefaultRequestOptions(requestOptions)
                .load(glideUrl)
                .into(imageView);
    }*/
}
