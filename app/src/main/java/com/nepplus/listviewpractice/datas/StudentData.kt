package com.nepplus.listviewpractice.datas

class StudentData(
    val name: String,
    val birthYear: Int,
    val address: String
) {
//    함수로 학생의 기능을 만들자// 본인의 나이를 계산해서 알려주는 기능

    fun getAge(year:Int): Int{
        val age= year-this.birthYear+1
        return age

    }




}