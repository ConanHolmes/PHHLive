package com.ningjiahao.phhlive.adpter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.ningjiahao.phhlive.R;
import com.ningjiahao.phhlive.activity.LiveActivity;
import com.ningjiahao.phhlive.bean.ZuiXinBean;
import com.ningjiahao.phhlive.helper.RecyclerViewAdapterHelper;

import java.util.List;

/**
 * Created by HP on 2016/11/23.
 */

public class ZiuXinAdapter extends RecyclerViewAdapterHelper<ZuiXinBean.DataBean.ListBean>{

    public ZiuXinAdapter(Context context, List<ZuiXinBean.DataBean.ListBean> list) {
        super(context, list);
    }

    @Override
    public RecyclerView.ViewHolder onCreateMyViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_zuixin,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder)holder;
        ZuiXinBean.DataBean.ListBean listBean = mList.get(position);
        String nickname = listBean.getNickname();
        myViewHolder.textView_username_zuixin.setText(nickname);
        String photo = listBean.getPhoto();
        Glide.with(mContext).load(Uri.parse(photo)).placeholder(R.mipmap.head_default).into(myViewHolder.imageView_background_zuixin);
        String position1 = listBean.getPosition();
        myViewHolder.textView_position_zuixin.setText(position1);
        //判断是否有new的图标
        int newX = listBean.getNewX();
        if (newX==1){
            Glide.with(mContext).load(R.mipmap.icon_new).into(myViewHolder.imageView_youshang_zuixin);
        }
        //判断星级
        int starlevel = listBean.getStarlevel();
        switch (starlevel){
            case 1:
                Glide.with(mContext).load(R.mipmap.star_level1).into(myViewHolder.imageView_star_zuixin);
                break;
            case 2:
                Glide.with(mContext).load(R.mipmap.star_level2).into(myViewHolder.imageView_star_zuixin);
                break;
            case 3:
                Glide.with(mContext).load(R.mipmap.star_level3).into(myViewHolder.imageView_star_zuixin);
                break;
            case 4:
                Glide.with(mContext).load(R.mipmap.star_level4).into(myViewHolder.imageView_star_zuixin);
                break;
            case 5:
                Glide.with(mContext).load(R.mipmap.star_level5).into(myViewHolder.imageView_star_zuixin);
                break;
        }
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView_background_zuixin, imageView_youshang_zuixin,
                imageView_star_zuixin;
        private TextView textView_position_zuixin, textView_username_zuixin;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView_background_zuixin = (ImageView) itemView.findViewById(R.id.imageView_background_zuixin);
            imageView_youshang_zuixin = (ImageView) itemView.findViewById(R.id.imageView_youshang_zuixin);
            imageView_star_zuixin = (ImageView) itemView.findViewById(R.id.imageView_star_zuixin);
            textView_position_zuixin = (TextView) itemView.findViewById(R.id.textView_position_zuixin);
            textView_username_zuixin = (TextView) itemView.findViewById(R.id.textView_username_zuixin);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(mContext, LiveActivity.class);
                    intent.putExtra("String","new");
                    intent.putExtra("key",mList.get(getAdapterPosition()));
                    mContext.startActivity(intent);
                }
            });
        }
    }
}
