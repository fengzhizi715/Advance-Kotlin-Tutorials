package chapter6.section3

/**
 *
 * @FileName:
 *          chapter6.section3.Upper
 * @author: Tony Shen
 * @date: 2021/12/10 1:56 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun <T : Number> sum(vararg param: T) = param.sumByDouble { it.toDouble() }

fun main() {

    val result1 = sum(1,10,0.6)
//    val result2 = sum(1,10,0.6,"kotlin") // compile error
}
