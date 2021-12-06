package chapter2.section2

/**
 *
 * @FileName:
 *          chapter2.section2.Outter1
 * @author: Tony Shen
 * @date: 2021/12/6 9:34 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Outter1 {

    val str:String = "this property is from outter1 class"

    class Nested {

        fun foo() = println("")
    }
}

fun main(args: Array<String>) {
    Outter1.Nested().foo()
}
