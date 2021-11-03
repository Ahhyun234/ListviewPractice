package com.nepplus.listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.listviewpractice.adapters.StudentAdapter
import com.nepplus.listviewpractice.datas.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<StudentData>()
    lateinit var mStudent_adapter: StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(StudentData("이아현",1996,"서울시동대문구"))
        mStudentList.add(StudentData("조경진",1988,"서울시동대문구"))
        mStudentList.add(StudentData("김준기",1996,"경기도 남양주"))
        mStudentList.add(StudentData("방우진",1983,"경기도 고양시"))
        mStudentList.add(StudentData("이지원",1993,"경기도 관악구"))
        mStudentList.add(StudentData("이지원",1993,"경기도 관악구"))

        mStudent_adapter = StudentAdapter(this, R.layout.student_list_item,mStudentList)
        studentListView.adapter = mStudent_adapter
    }
}