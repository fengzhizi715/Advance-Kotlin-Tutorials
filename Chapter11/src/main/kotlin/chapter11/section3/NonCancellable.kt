package chapter11.section3

import kotlinx.coroutines.*

/**
 *
 * @FileName:
 *          chapter11.section3.NonCancellable
 * @author: Tony Shen
 * @date: 2021/12/16 8:43 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main() {
    val job =  GlobalScope.launch {

        withContext(NonCancellable) {

            delay(2000)
            println("this code can not be cancel")
        }
    }

    job.cancel()

    Thread.sleep(5000)
}