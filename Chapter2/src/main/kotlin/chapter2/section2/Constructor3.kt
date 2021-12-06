package chapter2.section2

/**
 *
 * @FileName:
 *          chapter2.section2.Constructor3
 * @author: Tony Shen
 * @date: 2021/12/6 9:32 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Constructor3(str:String) {

    init {

        println("$str")
    }

    constructor(str1: String, str2: String):this(str1) { // 调用主构造函数以及初始化块

        println("$str1 $str2")
    }

    fun foo() = println("this is foo function")

}

fun main(args: Array<String>) {
    val obj = Constructor3("hello","world")
    obj.foo()
}