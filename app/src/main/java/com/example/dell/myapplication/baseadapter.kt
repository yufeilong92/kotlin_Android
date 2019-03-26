package com.example.dell.myapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * @Title:  kotlin
 * @Package com.example.dell.myapplication
 * @Description:    $todo$
 * @author: L-BackPacker
 * @date:   2019/3/13 22:08
 * @version V 1.0 xxxxxxxx
 * @verdescript  版本号 修改时间  修改人 修改的概要说明
 * @Copyright: 2019
 */
class baseadapter(var context: Context, var mList: MutableList<*>) :
    RecyclerView.Adapter<baseadapter.BaseViewHolder>() {
    inner class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var mTv = itemView.findViewById<TextView>(R.id.tv_content)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): baseadapter.BaseViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.item, null)
         val holde = BaseViewHolder(view)
        return holde
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(p0: baseadapter.BaseViewHolder, p1: Int) {
        val any = mList[p1].toString()
        p0.mTv.text = any

        p0.mTv.setOnClickListener {view->
            onItemlist.let {
                onItemlist!!.onItemListener(p1,any)
            }
        }

    }

    interface OnItemClickListener {
        fun onItemListener(postion:Int,str: String)
    }

    var onItemlist: OnItemClickListener? = null
    fun setOnClickLisenter(onItemClickListener: OnItemClickListener) {
        this.onItemlist = onItemClickListener
    }



}