package chapter9.section2

/**
 *
 * @FileName:
 *          chapter9.section2.Infix1
 * @author: Tony Shen
 * @date: 2021/12/15 8:41 PM
 * @version: V1.0 <描述当前版本功能>
 */
infix fun Int.add(i:Int):Int = this + i

infix fun Int.加(i:Int):Int = this + i

fun main(args: Array<String>) {

    println(5 add 10)
    println(5 加 10)
}
