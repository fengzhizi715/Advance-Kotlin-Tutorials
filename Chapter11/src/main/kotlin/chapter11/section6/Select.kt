package chapter11.section6

import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.*
import kotlinx.coroutines.selects.select
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.produce


/**
 *
 * @FileName:
 *          chapter11.section6.Select
 * @author: Tony Shen
 * @date: 2021/12/16 9:27 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun produce1(context: CoroutineContext) = GlobalScope.produce<String>(context) {

    while (true) {
        delay(400)
        send("Tony")
    }
}

fun produce2(context: CoroutineContext) = GlobalScope.produce<String>(context) {

    while (true) {
        delay(600)
        send("Monica")
    }
}

suspend fun selectProduces(channel1: ReceiveChannel<String>, channel2: ReceiveChannel<String>) {

    select<Unit> {

        channel1.onReceive {
            println("This is $it")
        }

        channel2.onReceive {
            println("This is $it")
        }
    }
}

fun main() = runBlocking {

    val tony = produce1(coroutineContext)
    val monica = produce2(coroutineContext)

    repeat(10) {
        selectProduces(tony, monica)
    }

    coroutineContext.cancelChildren() // 关闭子协程
}
