package chapter3.section1

/**
 *
 * @FileName:
 *          chapter3.section1.Sum1
 * @author: Tony Shen
 * @date: 2021/12/7 1:18 AM
 * @version: V1.0 <描述当前版本功能>
 */
fun sum(a: Int, b: Int, term: (Int) -> Int): Int {
    var sum = 0
    for (i in a..b) {
        sum += term(i)
    }
    return sum
}

fun main(args: Array<String>) {
    val identity = { x: Int -> x }
    val square = { x: Int -> x * x }
    val cube = { x: Int -> x * x * x }

    println(sum(1, 10, identity)) //  55
    println(sum(1, 10, square))   //  385
    println(sum(1, 10, cube))     //  3025
}
