package com.example.dell.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var mList = arrayListOf<String>()
        for (id in 0 until 10) {
            mList.add("测试" + id)
        }
        var manger = GridLayoutManager(this, 1)
        manger.orientation = GridLayoutManager.VERTICAL
        rlv.layoutManager = manger
        var adapter = baseadapter(this, mList)
        rlv.adapter = adapter
        adapter.setOnClickLisenter(object : baseadapter.OnItemClickListener {
            override fun onItemListener(postion: Int, str: String) {
                Toast.makeText(this@Main3Activity, str, Toast.LENGTH_SHORT).show()
            }

        })
        var tab= mutableListOf<String>()
    }
}
