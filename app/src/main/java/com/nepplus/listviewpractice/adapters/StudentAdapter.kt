package com.nepplus.listviewpractice.adapters

import android.content.Context
import android.content.LocusId
import android.icu.text.Transliterator
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
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

//        기본 모양으로 만들어진 Row를 이용해서 -> 실제 데이터를 적용시키고 나서
//        목록으로 들어온 mList중 position에 맞는 학생 데이터 추출
//        cf: ArrayList 0~시작

        val data = mList[position]

        Log.d("학생이름",data.name)

        val txtname = row.findViewById<TextView>(R.id.txtName)
        val txtname = row.findViewById<TextView>(R.id.txtAge)
        val txtname = row.findViewById<TextView>(R.id.txtAddress)

        return row
    }
}