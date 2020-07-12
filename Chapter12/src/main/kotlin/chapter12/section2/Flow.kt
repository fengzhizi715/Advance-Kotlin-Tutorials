package chapter12.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter12.section2.Flow1
 * @author: Tony Shen
 * @date: 2020-07-12 14:23
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    launch {
        for (j in 1..5) {
            delay(100)
            println("I'm not blocked $j")
        }
    }

    flow {
        for (i in 1..5) {
            delay(100)
            emit(i)
        }
    }.collect { println(it) }

    println("Done")
}