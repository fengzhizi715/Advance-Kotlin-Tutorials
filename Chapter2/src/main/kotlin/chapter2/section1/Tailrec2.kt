package chapter2.section1

/**
 *
 * @FileName:
 *          chapter2.section1.Tailrec2
 * @author: Tony Shen
 * @date: 2021/12/6 1:46 PM
 * @version: V1.0 <描述当前版本功能>
 */
tailrec fun sumWithTailrec(n: Int, result: Int): Int = if (n <= 0) result else sumWithTailrec(n-1,result+n)

fun main(args: Array<String>) {
    println(sumWithTailrec(100000,0))
}
