package chapter7.section3

import  kotlin.reflect.KFunction2

/**
 *
 * @FileName:
 *          chapter7.section3.KFunctionN1
 * @author: Tony Shen
 * @date: 2021/12/13 2:23 PM
 * @version: V1.0 <描述当前版本功能>
 */
val sum = {
        x: Int, y: Int -> x + y
}

fun sumFunction(x: Int, y: Int) = x + y

fun main() {
    println(sum(3,5))

    val sunFunc:KFunction2<Int,Int,Int> = ::sumFunction
    println(sunFunc.invoke(3,5))

    println(sunFunc.call(3, 5))
}
