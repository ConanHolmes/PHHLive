package com.ningjiahao.phhlive.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ningjiahao.phhlive.R;
import com.ningjiahao.phhlive.adpter.ZiuXinAdapter;
import com.ningjiahao.phhlive.base.BaseFragment;
import com.ningjiahao.phhlive.bean.ZuiXinBean;
import com.ningjiahao.phhlive.config.URLConstants;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * A simple {@link Fragment} subclass.
 */
public class ZuiXinFragment extends BaseFragment {
    private SwipeRefreshLayout swipeRefreshLayout_zuixin;
    private RecyclerView recyclerView_zuixin;
    private List<ZuiXinBean.DataBean.ListBean> mList = new ArrayList<>();
    private ZiuXinAdapter adapter;
    private int page = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_zui_xin, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView_zuixin = (RecyclerView) view.findViewById(R.id.recyclerView_zuixin);
        adapter = new ZiuXinAdapter(mContext,mList);
        recyclerView_zuixin.setAdapter(adapter);
        GridLayoutManager manager = new GridLayoutManager(mContext,3);
        recyclerView_zuixin.setLayoutManager(manager);
        //Recycler滑动到底部加载更多的监听
        recyclerView_zuixin.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if(newState == RecyclerView.SCROLL_STATE_IDLE) {//RecyclerView滑动到底部了
                    page++;
                    mRetrofitApi.getZuiXinBean(URLConstants.ZUI_XIN_URL,String.valueOf(page))
                            .subscribeOn(Schedulers.newThread())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe(new Subscriber<ZuiXinBean>() {
                                @Override
                                public void onCompleted() {

                                }

                                @Override
                                public void onError(Throwable e) {
                                    //最新数据加载出错
                                    Log.e("ZuiXinFragment","最新数据加载出错");
                                }

                                @Override
                                public void onNext(ZuiXinBean zuiXinBean) {
                                    List<ZuiXinBean.DataBean.ListBean> list = zuiXinBean.getData().getList();
                                    mList.addAll(list);
                                    adapter.notifyDataSetChanged();
                                }
                            });
                }
            }
        });
        swipeRefreshLayout_zuixin = (SwipeRefreshLayout) view.findViewById(R.id.swipeRefresh_zuixin);
        //设置进度条北京颜色
        swipeRefreshLayout_zuixin.setProgressBackgroundColorSchemeColor(getResources().getColor(R.color.whitesmoke));
        //设置进度条变化颜色
        swipeRefreshLayout_zuixin.setColorSchemeColors(getResources().getColor(R.color.darkgray),getResources().getColor(R.color.colorAccent));
        //设置进度圈的大小
        swipeRefreshLayout_zuixin.setSize(SwipeRefreshLayout.DEFAULT);
        //设置刷新
        swipeRefreshLayout_zuixin.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                mRetrofitApi.getZuiXinBean(URLConstants.ZUI_XIN_URL,String.valueOf(1))
                        .subscribeOn(Schedulers.newThread())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Subscriber<ZuiXinBean>() {
                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {
                                //最新数据加载出错
                                Log.e("ZuiXinFragment","最新数据加载出错");
                            }

                            @Override
                            public void onNext(ZuiXinBean zuiXinBean) {
                                List<ZuiXinBean.DataBean.ListBean> list = zuiXinBean.getData().getList();
                                mList.clear();
                                Log.e("ZuiXinFragment",list.get(0).getNickname());
                                mList.addAll(list);
                                adapter.notifyDataSetChanged();
                                swipeRefreshLayout_zuixin.setRefreshing(false);
                            }
                        });
            }
        });

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mRetrofitApi.getZuiXinBean(URLConstants.ZUI_XIN_URL,String.valueOf(page))
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ZuiXinBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        //最新数据加载出错
                        Log.e("ZuiXinFragment","最新数据加载出错");
                    }

                    @Override
                    public void onNext(ZuiXinBean zuiXinBean) {
                        List<ZuiXinBean.DataBean.ListBean> list = zuiXinBean.getData().getList();
                        mList.clear();
                        Log.e("ZuiXinFragment",list.get(0).getNickname());
                        mList.addAll(list);
                        adapter.notifyDataSetChanged();
                    }
                });
    }
}
