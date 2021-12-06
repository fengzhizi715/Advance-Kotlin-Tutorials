package chapter2.section1

/**
 *
 * @FileName:
 *          chapter2.section1.Nothing
 * @author: Tony Shen
 * @date: 2021/12/6 1:45 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun doForever(): Nothing {
    while(true) {
        println("do something...")
    }
}

fun main(args: Array<String>) {
    doForever()
    println("done")
}