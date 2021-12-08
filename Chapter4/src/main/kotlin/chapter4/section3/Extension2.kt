package chapter4.section3

/**
 *
 * @FileName:
 *          chapter4.section3.Extension2
 * @author: Tony Shen
 * @date: 2021/12/8 1:30 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Extension2 {
    fun test() = println("this is from test()")
}

fun Extension2.test() = println("this is from extension function") // 扩展函数 test

fun main(args: Array<String>) {
    var extension2 = Extension2()
    extension2.test()
}
