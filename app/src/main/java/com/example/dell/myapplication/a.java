package com.example.dell.myapplication;

import android.content.Context;
import android.view.LayoutInflater;

import java.util.List;

/**
 * @version V 1.0 xxxxxxxx
 * @Title: kotlin
 * @Package com.example.dell.myapplication
 * @Description: todo
 * @author: L-BackPacker
 * @date: 2019/3/13 22:12
 * @verdescript 版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2019
 */
public class a {
    private Context mContext;
    private List<?> mList;
    private final LayoutInflater mInflater;

    public a(Context mContext, List<?> mList) {
        this.mContext = mContext;
        this.mList = mList;
        mInflater = LayoutInflater.from(mContext);
    }
}
