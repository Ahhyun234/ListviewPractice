package com.nepplus.listviewpractice

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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
//        리스트뷰의 각 줄이 눌린 이벤트를 처리
        studentListView.setOnItemClickListener { adapterView, view, position, l ->

//            position 몇번 줄이 눌렸는지 알려주는 역할
            Log.d("리스트뷰","{$position}번 줄 클릭됨")


//          눌린 위치에 맞는 학생 데이터 변수에 저장
            
            val clickedStudent = mStudentList[position]
            
//            ex.눌린 학생의 이름을 토스트로 출력
            Toast.makeText(this, "${clickedStudent.name} 학생 클릭됨", Toast.LENGTH_SHORT).show()

//            상세 보기 화면으로 이동 ******
            val myIntent = Intent(this, ViewStudentDetailActivity::class.java)
            myIntent.putExtra("name",clickedStudent.name)
            myIntent.putExtra("birthYear",clickedStudent.birthYear)
            myIntent.putExtra("address",clickedStudent.address)
            startActivity((myIntent))

        }
//        true/false를 결과로 지정해줘야 함
        
        studentListView.setOnItemLongClickListener { adapterView, view, position, l ->  
            
            val longClickedStudent = mStudentList[position]

            Toast.makeText(this, "${position}길게 눌렸다", Toast.LENGTH_SHORT).show()

//            정말 그학생을 지울건지? 확인을 눌러야만 지우자

            val alert = AlertDialog.Builder(this)
            alert.setTitle("학생삭제 확인")
            alert.setMessage("정말${longClickedStudent.name}학생을 제거하시겠습니까?")
            alert.setPositiveButton("확인", DialogInterface.OnClickListener { dialogInterface, i ->

//                확인이 눌렸을 때만 실행되는 코드



//          롱클릭시 학생을 지우는 경우
                mStudentList.remove(longClickedStudent)
//      리스트뷰->  어댑터에게 새로고침 생기자

                mStudent_adapter.notifyDataSetChanged()



            })


            alert.setNegativeButton("취소",null)
            alert.show()

            return@setOnItemLongClickListener true








    }
} }