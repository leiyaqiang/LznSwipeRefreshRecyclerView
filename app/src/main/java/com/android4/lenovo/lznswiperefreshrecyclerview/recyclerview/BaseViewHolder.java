package com.android4.lenovo.lznswiperefreshrecyclerview.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.android4.lenovo.lznswiperefreshrecyclerview.beans.BaseBean;
import com.android4.lenovo.lznswiperefreshrecyclerview.cards.BaseCard;


public class BaseViewHolder extends RecyclerView.ViewHolder{
    private BaseCard mItemView;

    public BaseViewHolder(View itemView) {
        super(itemView);
        mItemView = (BaseCard) itemView;
    }

    public void bindData(BaseBean baseBean){
        mItemView.bindData(baseBean);
    }

}
