package com.ningjiahao.phhlive.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ningjiahao.phhlive.R;
import com.ningjiahao.phhlive.adpter.HotFragmentRecyclerAdapter;
import com.ningjiahao.phhlive.base.BaseFragment;
import com.ningjiahao.phhlive.bean.AdBean;
import com.ningjiahao.phhlive.bean.HotDataBean;
import com.ningjiahao.phhlive.config.URLConstants;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * A simple {@link Fragment} subclass.
 */
public class HotFragment extends BaseFragment {
    private RecyclerView Hot_Recycler;
    private HotFragmentRecyclerAdapter hotFragmentRecyclerAdapter;
    private List<AdBean.DataBean> adlist=new ArrayList<>();
    private List<Object> list=new ArrayList<>();
    public HotFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hot, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Hot_Recycler= (RecyclerView) view.findViewById(R.id.Hot_Recycler);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getAdData();
        getHotData();
    }
    private void getHotData(){
        mRetrofitApi.getHotDataBean(URLConstants.URL_HOT_DATA)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<HotDataBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(mContext, "网络出错", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNext(HotDataBean hotDataBean) {
                        list.add(true);
                        list.addAll(hotDataBean.getData().getList());
                        hotFragmentRecyclerAdapter=new HotFragmentRecyclerAdapter(mContext,list,adlist);
                        Hot_Recycler.setLayoutManager(new LinearLayoutManager(mContext,LinearLayoutManager.VERTICAL,false));
                        Hot_Recycler.setAdapter(hotFragmentRecyclerAdapter);
                    }
                });
    }
    private void getAdData(){
        mRetrofitApi.getAdBean(URLConstants.URL_AD_DATA)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<AdBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(mContext, "网络出错2", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onNext(AdBean adBean) {
                        adlist.addAll(adBean.getData());
                    }
                });
    }
}
