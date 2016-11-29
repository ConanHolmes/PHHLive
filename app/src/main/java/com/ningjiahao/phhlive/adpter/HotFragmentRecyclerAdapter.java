package com.ningjiahao.phhlive.adpter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.bumptech.glide.Glide;
import com.jude.rollviewpager.OnItemClickListener;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.LoopPagerAdapter;
import com.ningjiahao.phhlive.activity.LiveActivity;
import com.ningjiahao.phhlive.R;
import com.ningjiahao.phhlive.bean.AdBean;
import com.ningjiahao.phhlive.bean.HotDataBean;
import com.ningjiahao.phhlive.helper.RecyclerViewAdapterHelper;

import java.util.List;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

/**
 * Created by 甯宁寧 on 2016-11-23.
 */

public class HotFragmentRecyclerAdapter extends RecyclerViewAdapterHelper<Object>{
    public static final int TYPE1=0;
    public static final int TYPE2=1;
    private int count=0;
    private  List<AdBean.DataBean> adList;
    public HotFragmentRecyclerAdapter(Context context, List<Object> list,List<AdBean.DataBean> adList) {
        super(context, list);
        this.adList=adList;
    }
    @Override
    public int getItemViewType(int position) {
        if(mList.get(position) instanceof Boolean){
            return TYPE1;
        }
        return TYPE2;
    }
    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        if(viewType==TYPE1){
            View view=mInflater.inflate(R.layout.ad_viewpager_layout,parent,false);
            return new MyViewHolder2(view);
        }else{
            View view=mInflater.inflate(R.layout.room_item_layout,parent,false);
            return new MyViewHolder(view);
        }
    }
    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof MyViewHolder){
            HotDataBean.DataBean.ListBean listBean = (HotDataBean.DataBean.ListBean) mList.get(position);
            Glide.with(mContext).load(listBean.getBigpic())
                    .placeholder(R.mipmap.default_photo)
                    .into(((MyViewHolder) holder).bigImage);
            if(listBean.getIsSign()==1){
                Glide.with(mContext).load(R.mipmap.icon_sign).placeholder(R.mipmap.default_photo)
                    .into(((MyViewHolder) holder).isSignedImage);
            }
            Glide.with(mContext).load(listBean.getSmallpic()).placeholder(R.mipmap.default_photo)
                    .bitmapTransform(new CropCircleTransformation(mContext))
                    .into(((MyViewHolder) holder).userImage);
            ((MyViewHolder) holder).username.setText(listBean.getMyname());
            ((MyViewHolder) holder).family.setText(listBean.getFamilyName());
            ((MyViewHolder) holder).LookNum.setText(listBean.getAllnum()+"人观看");
            ((MyViewHolder) holder).userlocal.setText(listBean.getGps());
            switch (listBean.getStarlevel()){
                case 1:
                    Glide.with(mContext).load(R.mipmap.star_level1).placeholder(R.mipmap.default_photo)
                            .into(((MyViewHolder) holder).userlevel);
                    break;
                case 2:
                    Glide.with(mContext).load(R.mipmap.star_level2).placeholder(R.mipmap.default_photo)
                            .into(((MyViewHolder) holder).userlevel);
                    break;
                case 3:
                    Glide.with(mContext).load(R.mipmap.star_level3).placeholder(R.mipmap.default_photo)
                            .into(((MyViewHolder) holder).userlevel);
                    break;
                case 4:
                    Glide.with(mContext).load(R.mipmap.star_level4).placeholder(R.mipmap.default_photo)
                            .into(((MyViewHolder) holder).userlevel);
                    break;
                case 5:
                    Glide.with(mContext).load(R.mipmap.star_level5).placeholder(R.mipmap.default_photo)
                            .into(((MyViewHolder) holder).userlevel);
                    break;
                case 6:
                    Glide.with(mContext).load(R.mipmap.star_level6).placeholder(R.mipmap.default_photo)
                            .into(((MyViewHolder) holder).userlevel);
                    break;
            }
        }else if(holder instanceof MyViewHolder2){
            ((MyViewHolder2) holder).rollPagerView.resume();
        }
    }
    class MyViewHolder2 extends RecyclerView.ViewHolder{
        RollPagerView rollPagerView;
        public MyViewHolder2(View itemView) {
            super(itemView);
            rollPagerView= (RollPagerView) itemView.findViewById(R.id.rollPagerView);
            rollPagerView.setAdapter(new TestLoopAdapter(rollPagerView));
            rollPagerView.setOnItemClickListener(new OnItemClickListener() {
                @Override
                public void onItemClick(int position) {

                }
            });
        }
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView userImage,isSignedImage,userlevel,bigImage;
        TextView username,userlocal,LookNum,family;

        public MyViewHolder(View itemView) {
            super(itemView);
            userImage= (ImageView) itemView.findViewById(R.id.userImage);
            isSignedImage= (ImageView) itemView.findViewById(R.id.isSignedImage);
            userlevel= (ImageView) itemView.findViewById(R.id.userlevel);
            bigImage= (ImageView) itemView.findViewById(R.id.bigImage);
            username= (TextView) itemView.findViewById(R.id.username);
            userlocal= (TextView) itemView.findViewById(R.id.userlocal);
            LookNum= (TextView) itemView.findViewById(R.id.LookNum);
            family= (TextView) itemView.findViewById(R.id.family);
            bigImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(mContext, LiveActivity.class);
                    intent.putExtra("String","hot");
                    intent.putExtra("key", (HotDataBean.DataBean.ListBean) mList.get(getAdapterPosition()));
                    mContext.startActivity(intent);
                }
            });
        }
    }
    class MyEmptyViewHolder extends RecyclerView.ViewHolder{

        public MyEmptyViewHolder(View itemView) {
            super(itemView);
        }
    }
    private class TestLoopAdapter extends LoopPagerAdapter{

        public TestLoopAdapter(RollPagerView viewPager) {
            super(viewPager);
        }

        @Override
        public View getView(ViewGroup container, int position) {
            ImageView view = new ImageView(container.getContext());
            Glide.with(mContext)
                    .load(adList.get(position).getImageUrl())
                    .placeholder(R.mipmap.default_photo)
                    .into(view);
            view.setScaleType(ImageView.ScaleType.FIT_XY);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
            return view;
        }

        @Override
        public int getRealCount() {
            return adList.size();
        }
    }
}
