package chapter3.section1

/**
 *
 * @FileName:
 *          chapter3.section1.Sum2
 * @author: Tony Shen
 * @date: 2021/12/7 1:19 AM
 * @version: V1.0 <描述当前版本功能>
 */
fun sum(type: String): (Int, Int) -> Int {
    val identity = { x: Int -> x }
    val square = { x: Int -> x * x }
    val cube = { x: Int -> x * x * x }

    return when (type) {

        "identity" -> return { a, b -> sum(a, b, identity) }
        "square" -> return { a, b -> sum(a, b, square) }
        "cube" -> { a, b -> sum(a, b, cube) }
        else -> { a, b -> sum(a, b, identity) }
    }
}

fun main(args: Array<String>) {
    var identityFunction = sum("identity")
    println(identityFunction(1,10))     //  55

    var squareFunction = sum("square")
    println(squareFunction(1,10))       //  385

    var cubeFunction = sum("cube")
    println(cubeFunction(1,10))         //  3025
}
