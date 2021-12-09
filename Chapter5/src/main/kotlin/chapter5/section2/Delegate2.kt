package chapter5.section2

/**
 *
 * @FileName:
 *          chapter5.section2.Delegate2
 * @author: Tony Shen
 * @date: 2021/12/9 1:27 PM
 * @version: V1.0 <描述当前版本功能>
 */
interface Marks {

    fun printMarks()
}

class StdMarks : Marks {

    override fun printMarks() = println("printed marks")
}

class ExcelMarks : Marks {

    override fun printMarks() = println("printed marks and export to excel")
}

interface Totals {

    fun printTotals()
}

class StdTotals : Totals {

    override fun printTotals() = println("calculated and printed totals")
}

class ExcelTotals : Totals {

    override fun printTotals() = println("calculated and printed totals and export to excel")
}

class Student(studentId: Int, marks: Marks, totals: Totals)
    : Marks by marks, Totals by totals

fun main(args: Array<String>) {

    val student1 = Student(1, StdMarks(), StdTotals()) // StdMarks、StdTotals 为 Student 被委托的类
    student1.printMarks()
    student1.printTotals()

    println("---------------------------")

    val student2 = Student(2, ExcelMarks(), ExcelTotals()) // ExcelMarks、ExcelTotals 为 Student 被委托的类
    student2.printMarks()
    student2.printTotals()
}
