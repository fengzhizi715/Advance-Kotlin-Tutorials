package chapter2.section3

/**
 *
 * @FileName:
 *          chapter2.section3.Singleton2
 * @author: Tony Shen
 * @date: 2021/12/6 9:39 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Singleton2 private constructor() {

    companion object {
        val instance: Singleton2 by lazy { Singleton2() }
    }

    fun printlnHelloWorld() = println("hello world")
}

fun main(args: Array<String>) {

    val obj1 = Singleton2.instance
    val obj2 = Singleton2.instance
    println (obj1 === obj2)

    Singleton2.instance.printlnHelloWorld()
}