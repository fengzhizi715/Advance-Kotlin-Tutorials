package chapter2.section2

/**
 *
 * @FileName:
 *          chapter2.section2.Outter2
 * @author: Tony Shen
 * @date: 2021/12/6 9:35 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Outter2 {

    val str:String = "this property is from outter2 class"

    inner class Inner {

        fun foo() = println("$str")
    }
}

fun main(args: Array<String>) {
    Outter2().Inner().foo()
}