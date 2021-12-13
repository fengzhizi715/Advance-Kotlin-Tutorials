package chapter7.section3

/**
 *
 * @FileName:
 *          chapter7.section3.ClassProperty
 * @author: Tony Shen
 * @date: 2021/12/13 2:43 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Bar1(val x: Int)
class Bar2(val x: Int,val y:String)

fun main() {
    val bar1 = Bar1(1)
    val prop = Bar1::x
    println(prop.call(bar1))
    println(prop.getter.call(bar1))
    println(prop.get(bar1))

    val bar2 = Bar2(2,"test")
    val propX = Bar2::x
    val propY = Bar2::y
    println(propX.call(bar2))
    println(propY.call(bar2))
    println(propX.get(bar2))
}