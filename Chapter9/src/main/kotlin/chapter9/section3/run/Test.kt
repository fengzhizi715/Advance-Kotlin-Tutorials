package chapter9.section3.run

/**
 *
 * @FileName:
 *          chapter9.section3.run.Test
 * @author: Tony Shen
 * @date: 2021/12/15 8:45 PM
 * @version: V1.0 <描述当前版本功能>
 */
object Test {

    @JvmStatic
    fun main(args: Array<String>) {
        val result ="Hello".run {
            println(this+" World")

            this + " World" // run 返回的是最后一行的值
        }

        println(result)
    }
}
