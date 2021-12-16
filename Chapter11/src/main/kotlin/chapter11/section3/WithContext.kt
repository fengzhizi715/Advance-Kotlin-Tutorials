package chapter11.section3

import kotlinx.coroutines.*

/**
 *
 * @FileName:
 *          chapter11.section3.WithContext
 * @author: Tony Shen
 * @date: 2021/12/16 8:31 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) {

    GlobalScope.launch {

        val result1 = withContext(Dispatchers.Default) {

            delay(2000)
            1
        }

        val  result2 = withContext(Dispatchers.IO) {

            delay(1000)
            2
        }

        val  result = result1 + result2
        println(result)
    }

    Thread.sleep(5000)
}
