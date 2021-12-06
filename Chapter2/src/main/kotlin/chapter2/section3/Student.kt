package chapter2.section3

/**
 *
 * @FileName:
 *          chapter2.section3.Student
 * @author: Tony Shen
 * @date: 2021/12/6 9:39 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Student {

    companion object {

        private var username = "Tony"
        private var marks = "A"

        fun printMarks() = "The ${this.username}'s mark is ${this.marks}"

        fun changeMarks(marks:String){
            this.marks = marks
        }
    }
}

fun main(args: Array<String>) {
    Student.changeMarks("B")
    println(Student.printMarks())

    Student.changeMarks("C")
    println(Student.printMarks())
}