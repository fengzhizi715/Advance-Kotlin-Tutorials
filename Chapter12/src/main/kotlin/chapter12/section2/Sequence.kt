package chapter12.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter12.section2.Sequence
 * @author: Tony Shen
 * @date: 2020-07-12 14:26
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    launch {
        for (k in 1..5) {
            delay(100)
            println("I'm blocked $k")
        }
    }

    sequence {
        for (i in 1..5) {
            Thread.sleep(100)
            yield(i)
        }
    }.forEach { println(it) }

    println("Done")
}