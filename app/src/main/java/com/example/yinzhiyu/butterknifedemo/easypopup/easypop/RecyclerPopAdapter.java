package com.example.yinzhiyu.butterknifedemo.easypopup.easypop;


import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.yinzhiyu.butterknifedemo.R;

/**
 * Created by zyyoona7 on 2017/9/14.
 */

public class RecyclerPopAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    public RecyclerPopAdapter() {
        super(R.layout.layout_item_pop, null);
    }

    @Override
    protected void convert(BaseViewHolder baseViewHolder, String s) {
        baseViewHolder.addOnClickListener(R.id.iv_close);
    }
}
