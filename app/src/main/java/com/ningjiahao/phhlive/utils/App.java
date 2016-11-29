package com.ningjiahao.phhlive.utils;

import android.app.Application;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.integration.okhttp.OkHttpUrlLoader;
import com.bumptech.glide.load.model.GlideUrl;

import com.hyphenate.chat.EMClient;
import com.hyphenate.chat.EMOptions;
import com.ningjiahao.phhlive.helper.OkHttpClientHelper;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;


import java.io.InputStream;

import io.vov.vitamio.Vitamio;

import static com.bumptech.glide.gifdecoder.GifHeaderParser.TAG;


/**
 * Created by 甯宁寧 on 2016-11-14.
 */

public class App extends Application {
    {
        PlatformConfig.setWeixin("wx967daebe835fbeac", "5bb696d9ccd75a38c8a0bfe0675559b3");
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad");
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        EMOptions options = new EMOptions();
// 默认添加好友时，是不需要验证的，改成需要验证
        options.setAcceptInvitationAlways(false);
        EMClient.getInstance().init(this, options);
//在做打包混淆时，关闭debug模式，避免消耗不必要的资源
        EMClient.getInstance().setDebugMode(false);
        UMShareAPI.get(this);
        Glide.get(this).register(GlideUrl.class, InputStream.class,
                new OkHttpUrlLoader.Factory(OkHttpClientHelper.getOkHttpSingletonInstance()));
    }
}
