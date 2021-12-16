package chapter11.section6

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.ClosedReceiveChannelException
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter11.section6.Channel2
 * @author: Tony Shen
 * @date: 2021/12/16 9:17 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    val channel = Channel<Int>()  //定义一个通道
    launch(Dispatchers.Default) {

        repeat(5) {
            i ->
            delay(200)
            channel.send((i+1) * (i+1))

            if (i==2) {  // 发送3次后关闭

                channel.close()
            }
        }
    }

    launch(Dispatchers.Default) {

        repeat(5) {

            try {
                println(channel.receive())
            }catch (e: ClosedReceiveChannelException){
                println("There is a ClosedReceiveChannelException.") // channel 异常则打印
            }
        }
    }

    delay(2000)

    println("Receive Done!")
}
