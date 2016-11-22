package com.ningjiahao.phhlive.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;


import com.ningjiahao.phhlive.R;
import com.ningjiahao.phhlive.config.URLConstants;
import com.ningjiahao.phhlive.helper.OkHttp3Helper;
import com.ningjiahao.phhlive.retrofitinterface.MyRetrofitApi;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class BaseActivity extends AppCompatActivity {

    private Retrofit mRetrofit;
    public MyRetrofitApi myRetrofitApi;
    public Context mContext=this;
    public LayoutInflater mInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mInflater= (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        mRetrofit=new Retrofit.Builder()
                .baseUrl(URLConstants.BASE_IMAGE_URL)
                .client(OkHttp3Helper.getOkHttpSingletonInstance())
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        myRetrofitApi=mRetrofit.create(MyRetrofitApi.class);

    }
}
