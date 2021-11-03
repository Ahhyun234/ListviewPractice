package com.nepplus.listviewpractice.adapters

import android.content.Context
import android.content.LocusId
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nepplus.listviewpractice.R
import com.nepplus.listviewpractice.datas.StudentData

class Student_adapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData> )
    : ArrayAdapter<StudentData>(mContext, resId, mList) {

        val mInflater = LayoutInflater.from(mContext)

//    자동으로 생성 된 return super를 버렸음
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

    val tempLow  = convertView
    if(tempLow == null){
        tempLow =mInflater. inflate(R.layout.student_list_item,null)
    }
    }
}