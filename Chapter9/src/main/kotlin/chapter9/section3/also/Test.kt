package chapter9.section3.also

/**
 *
 * @FileName:
 *          chapter9.section3.also.Test
 * @author: Tony Shen
 * @date: 2021/12/15 8:46 PM
 * @version: V1.0 <描述当前版本功能>
 */
object Test {

    @JvmStatic
    fun main(args: Array<String>) {
        val result ="Hello".also {
            println(it + " World")

            it + " World"
        }

        println(result)
    }
}
