package com.ningjiahao.phhlive.retrofitinterface;


import com.ningjiahao.phhlive.bean.ZuiXinBean;

import java.util.Map;

import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by 甯宁寧 on 2016-11-14.
 */

public interface MyRetrofitApi {

    @GET
    Observable<ZuiXinBean> getZuiXinBean(@Url String url, @Query("page") String page);

}
