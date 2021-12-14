package chapter8.section2

/**
 *
 * @FileName:
 *          chapter8.section2.Receiver1
 * @author: Tony Shen
 * @date: 2021/12/14 2:31 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) {

    val sum1 = {
            x: Int, y: Int -> x + y
    }

    val sum2: Int.(Int) -> Int = {
        this + it
    }

    println(sum1(3,5))
    println(3.sum2(5))
}
