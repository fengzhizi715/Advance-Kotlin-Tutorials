package chapter7.section3

/**
 *
 * @FileName:
 *          chapter7.section3.KProperty
 * @author: Tony Shen
 * @date: 2021/12/13 2:35 PM
 * @version: V1.0 <描述当前版本功能>
 */
val x = 1
val y = "hello"

fun main() {
    println(::x)
    println(::x.get())
    println(::x.name)
    println(::y)
    println(::y.get())
    println(::y.name)
}
