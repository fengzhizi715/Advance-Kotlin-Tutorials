package chapter9.section2

/**
 *
 * @FileName:
 *          chapter9.section2.Infix2
 * @author: Tony Shen
 * @date: 2021/12/15 8:41 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Infix2 {

    infix fun add(i: Int):Int {

        return 5 + i
    }

    fun printValue() {

        println(this add 10)
        println(add(10))
    }
}

fun main(args: Array<String>) {

    var infix2 = Infix2()

    infix2.printValue()
}
