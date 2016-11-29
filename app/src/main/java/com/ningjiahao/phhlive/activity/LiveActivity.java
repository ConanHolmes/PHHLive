package com.ningjiahao.phhlive.activity;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.ningjiahao.phhlive.R;
import com.ningjiahao.phhlive.base.BaseActivity;
import com.ningjiahao.phhlive.bean.HotDataBean;
import com.ningjiahao.phhlive.bean.ZuiXinBean;
import com.umeng.socialize.ShareAction;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;

import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.Vitamio;
import io.vov.vitamio.widget.VideoView;
import jp.wasabeef.glide.transformations.CropCircleTransformation;


public class LiveActivity extends BaseActivity implements View.OnClickListener{
    private HotDataBean.DataBean.ListBean HotListBean;
    private ZuiXinBean.DataBean.ListBean NewListBean;
    private VideoView vitamio_video;
    private ImageView userImage_live,gift_live,task_live,rank_live,share_live,finish_live,publictalk_live,privatetalk_live;
    private TextView username_live,LookNum_live;
    private ProgressBar progressbar_video;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        /*set it to be no title*/
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        /*set it to be full screen*/
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_live);
        Vitamio.isInitialized(this);
        initView();
        initData();

    }
    private void initData() {
        Intent intent=getIntent();
        switch (intent.getStringExtra("String")){
            case "new":
                NewListBean=(ZuiXinBean.DataBean.ListBean)intent.getSerializableExtra("key");
                Glide.with(mContext)
                        .load(NewListBean.getPhoto())
                        .bitmapTransform(new CropCircleTransformation(mContext))
                        .placeholder(R.mipmap.default_photo)
                        .into(userImage_live);
                LookNum_live.setText(NewListBean.getAllnum()+"人");
                username_live.setText(NewListBean.getNickname());
                vitamio_video.setVideoPath(NewListBean.getFlv());
                vitamio_video.start();
                break;
            case "hot":
                HotListBean= (HotDataBean.DataBean.ListBean) intent.getSerializableExtra("key");
                Glide.with(mContext)
                        .load(HotListBean.getSmallpic())
                        .bitmapTransform(new CropCircleTransformation(mContext))
                        .placeholder(R.mipmap.default_photo)
                        .into(userImage_live);
                LookNum_live.setText(HotListBean.getAllnum()+"人");
                username_live.setText(HotListBean.getMyname());
                vitamio_video.setVideoPath(HotListBean.getFlv());
                vitamio_video.start();
                break;
        }


    }
    private void initView()
    {
        username_live= (TextView) findViewById(R.id.username_live);
        LookNum_live= (TextView) findViewById(R.id.LookNum_live);
        progressbar_video= (ProgressBar) findViewById(R.id.progressbar_video);
        task_live= (ImageView) findViewById(R.id.task_live);
        task_live.setOnClickListener(this);
        gift_live= (ImageView) findViewById(R.id.gift_live);
        gift_live.setOnClickListener(this);
        rank_live= (ImageView) findViewById(R.id.rank_live);
        rank_live.setOnClickListener(this);
        share_live= (ImageView) findViewById(R.id.share_live);
        share_live.setOnClickListener(this);
        finish_live= (ImageView) findViewById(R.id.finish_live);
        finish_live.setOnClickListener(this);
        publictalk_live= (ImageView) findViewById(R.id.publictalk_live);
        publictalk_live.setOnClickListener(this);
        privatetalk_live= (ImageView) findViewById(R.id.privatetalk_live);
        privatetalk_live.setOnClickListener(this);
        userImage_live= (ImageView) findViewById(R.id.userImage_live);
        vitamio_video= (VideoView) findViewById(R.id.vitamio_video);
        vitamio_video.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                progressbar_video.setVisibility(View.GONE);
            }
        });
    }
    @Override
    public void onBackPressed() {
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.privatetalk_live:
                break;
            case R.id.publictalk_live:

                break;
            case R.id.finish_live:
                finish();
                break;
            case R.id.share_live:
                new ShareAction(LiveActivity.this).withText("这个主播真好玩！")
                        .withTargetUrl(HotListBean.getFlv())
                        .setDisplayList(SHARE_MEDIA.SINA,SHARE_MEDIA.QQ,SHARE_MEDIA.WEIXIN)
                        .setCallback(umShareListener).open();
                break;
            case R.id.rank_live:
                break;
            case R.id.gift_live:
                break;
            case R.id.task_live:
                break;
        }
    }
    private UMShareListener umShareListener = new UMShareListener() {
        @Override
        public void onResult(SHARE_MEDIA platform) {
            Log.d("plat","platform"+platform);

            Toast.makeText(mContext, platform + " 分享成功啦", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onError(SHARE_MEDIA platform, Throwable t) {
            Toast.makeText(mContext,platform + " 分享失败啦", Toast.LENGTH_SHORT).show();
            if(t!=null){
                Log.d("throw","throw:"+t.getMessage());
            }
        }

        @Override
        public void onCancel(SHARE_MEDIA platform) {
            Toast.makeText(mContext,platform + " 分享取消了", Toast.LENGTH_SHORT).show();
        }
    };
}
