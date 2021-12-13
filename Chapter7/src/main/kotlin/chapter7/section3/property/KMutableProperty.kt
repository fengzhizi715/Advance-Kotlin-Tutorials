package chapter7.section3.property

/**
 *
 * @FileName:
 *          chapter7.section3.KMutableProperty
 * @author: Tony Shen
 * @date: 2021/12/13 2:36 PM
 * @version: V1.0 <描述当前版本功能>
 */
var x = 1
var y = "hello"

fun main() {
    println(::x)
    ::x.set(0)
    println(::x.get())
    println(::x.name)
    println(::y)
    ::y.set("world")
    println(::y.get())
    println(::y.name)
}
