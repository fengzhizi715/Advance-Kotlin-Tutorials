package chapter11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 *
 * @FileName:
 *          chapter11.section2.Async
 * @author: Tony Shen
 * @date: 2021/12/16 8:17 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) {

    GlobalScope.launch {

        val result1 = async {

            delay(2000)
            1
        }

        val  result2 = async {

            delay(1000)
            2
        }

        val  result = result1.await() + result2.await()
        println(result)
    }

    Thread.sleep(5000)
}
