package chapter11.section6

import com.sun.management.jmx.Trace.send
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.channels.produce
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter11.section6.Produce
 * @author: Tony Shen
 * @date: 2021/12/16 9:22 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun produce1() = GlobalScope.produce(Dispatchers.Default) {

    repeat(5) { // 发送从0到4
            i-> send(i)
    }
}

fun produce2(numbers: ReceiveChannel<Int>) = GlobalScope.produce(Dispatchers.Default) {

    for (x in numbers) {
        send((x * x))
    }
}

fun produce3(numbers: ReceiveChannel<Int>) = GlobalScope.produce(Dispatchers.Default) {

    for (x in numbers) {
        send(x+1)
    }
}

fun main() = runBlocking<Unit> {

    val numbers = produce1()
    val squares = produce2(numbers)
    val adds = produce3(squares)

    adds.consumeEach(::println)

    println("Receive Done!")

    // 消费完消息之后，关闭所有的produce
    adds.cancel()
    squares.cancel()
    numbers.cancel()
}
