package chapter2.section3

/**
 *
 * @FileName:
 *          chapter2.section3.Singleton1
 * @author: Tony Shen
 * @date: 2021/12/6 9:37 PM
 * @version: V1.0 <描述当前版本功能>
 */
object Singleton1 {

    fun printlnHelloWorld() = println("hello world")
}

fun main(args: Array<String>) {
    Singleton1.printlnHelloWorld()
}