package chapter11.section6

import kotlinx.coroutines.channels.actor
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter11.section6.Actor
 * @author: Tony Shen
 * @date: 2021/12/16 9:26 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) = runBlocking<Unit> {

    val summer = actor<Int>(coroutineContext) {
        var sum = 0

        for (i in channel) { // 不断接收channel中的数据，这个channel是ActorScope的变量
            sum += i
            println("Sum = $sum")
        }
    }

    repeat(10) {

            i->summer.send(i+1) // 发送从1到10
    }

    summer.close()
}
