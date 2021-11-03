package com.nepplus.listviewpractice.adapters

import android.content.Context
import android.content.LocusId
import android.widget.ArrayAdapter
import com.nepplus.listviewpractice.datas.StudentData

class Student_adapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData> )
    : ArrayAdapter<StudentData>(mContext, resId, mList) {
}