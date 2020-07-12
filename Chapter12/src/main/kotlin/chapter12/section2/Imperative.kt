package chapter12.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter12.section2.Imperative
 * @author: Tony Shen
 * @date: 2020-07-12 14:43
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {
    try {
        flow {
            for (i in 1..5) {
                delay(100)
                emit(i)
            }
        }.collect { println(it) }
    } finally {
        println("Done")
    }
}