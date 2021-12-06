package chapter2.section1

/**
 *
 * @FileName:
 *          chapter2.section1.Tailrec1
 * @author: Tony Shen
 * @date: 2021/12/6 9:30 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun sum(n: Int, result: Int): Int = if (n <= 0) result else sum(n-1,result+n)

fun main(args: Array<String>) {
    println(sum(100000,0))
}