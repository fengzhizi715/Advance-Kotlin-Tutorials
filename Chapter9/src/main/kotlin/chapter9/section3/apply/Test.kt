package chapter9.section3.apply

/**
 *
 * @FileName:
 *          chapter9.section3.apply.Test
 * @author: Tony Shen
 * @date: 2021/12/15 8:44 PM
 * @version: V1.0 <描述当前版本功能>
 */
object Test {

    @JvmStatic
    fun main(args: Array<String>) {
        val result ="Hello".apply {
            println(this+" World")

            this+" World" // apply 会返回该对象自己，所以 result 的值依然是“Hello”
        }

        println(result)
    }
}
