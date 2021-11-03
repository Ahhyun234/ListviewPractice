package com.nepplus.listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_student_detail.*


class ViewStudentDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_student_detail)



        val name = intent.getStringExtra("name")
        txtName.text = name

        val address = intent.getStringExtra("address")
        txtAddress.text=address

        val birthYear = intent.getIntExtra("birthYear")
        txtAge.text=birthYear
//        만약 다른 템플릿의 변수를 선택했다면 상단 Import에서 선택된 다른 템플릿 줄을 삭제


    }
}