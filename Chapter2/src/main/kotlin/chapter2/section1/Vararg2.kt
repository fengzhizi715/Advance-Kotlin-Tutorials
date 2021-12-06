package chapter2.section1

/**
 *
 * @FileName:
 *          chapter2.section1.Vararg2
 * @author: Tony Shen
 * @date: 2021/12/6 9:29 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) {
    val array = arrayOf("java","kotlin","scala","groovy")
    val list = toList(*array)
    println(list)
}