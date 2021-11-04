package com.nepplus.listviewpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.listviewpractice.datas.StudentData
import kotlinx.android.synthetic.main.activity_view_student_detail.*


class ViewStudentDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_student_detail)

//      통쨰로 넘겨준 StudentData를 Intent에서 받아오자
//        Serializable을 받아오고 있다. StudentData가 아님 => Studentdata로 복원해야함

        val studentData = intent.getSerializableExtra("Student")as StudentData

        txtName.text = studentData.name
        txtAge.text - "${studentData.getAge(2021)}세"
        txtAddress.text = studentData.address

//        val name = intent.getStringExtra("name")
//        txtName.text = name
//
//        val address = intent.getStringExtra("address")
//        txtAddress.text=address


//        만약 다른 템플릿의 변수를 선택했다면 상단 Import에서 선택된 다른 템플릿 줄을 삭제


    }
}