package chapter3.section2

/**
 *
 * @FileName:
 *          chapter3.section2.Lambda
 * @author: Tony Shen
 * @date: 2021/12/7 1:22 AM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) {
    val sum = {
            x: Int, y: Int -> x + y
    }

    println(sum(3, 5)) // 8
    println(sum(4, 6)) // 10
}
