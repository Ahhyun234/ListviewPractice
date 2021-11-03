package com.nepplus.listviewpractice.adapters

import android.content.Context
import android.content.LocusId
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nepplus.listviewpractice.R
import com.nepplus.listviewpractice.datas.StudentData

class StudentAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {

    val mInflater = LayoutInflater.from(mContext)

    //    자동으로 생성 된 return super를 버렸음
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.student_list_item, null)
        }
//    tempRow가 비어있다면 채워주기 때문에, 비어있을 가능성은 없다. 따라서 안전하게 사용 가능한 Row를 만들자
        val row = tempRow!!
        return row
    }
}