package chapter11.section6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter11.section6.Channel1
 * @author: Tony Shen
 * @date: 2021/12/16 9:16 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    val channel = Channel<Int>()  //定义一个通道

    launch(Dispatchers.Default) {

        repeat(5) { // 重复5次发送消息，相当于 for(int i=0;i<5;i++)
            i ->
            delay(200)
            channel.send((i + 1) * (i + 1))
        }
    }

    launch(Dispatchers.Default) {

        repeat(5) {

            println(channel.receive())
        }
    }

    delay(2000)

    println("Receive Done!")
}