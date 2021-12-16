package chapter11.section6

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter11.section6.Channel4
 * @author: Tony Shen
 * @date: 2021/12/16 9:25 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking<Unit>{

    val channel = Channel<Int>(2) // 创建带有缓冲区的 channel

    launch(kotlin.coroutines.coroutineContext) {
        repeat(6) {
            delay(50)
            println("Sending $it")
            channel.send(it)
        }
    }

    launch {

        delay(1000)
        repeat(6) {
            println("Receive ${channel.receive()}")
        }
    }

    delay(20000)
}
