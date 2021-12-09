package chapter5.section3

/**
 *
 * @FileName:
 *          chapter5.section3.Lazy
 * @author: Tony Shen
 * @date: 2021/12/9 1:45 PM
 * @version: V1.0 <描述当前版本功能>
 */
val str: String by lazy{
    println("aaron")
    println("cafei")
    "tony"  // 最后一行为返回值
}

fun main(args: Array<String>) {
    println(str)
    println("-----------")
    println(str)
}
