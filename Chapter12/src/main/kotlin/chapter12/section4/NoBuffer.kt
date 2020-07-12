package chapter12.section4

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 *
 * @FileName:
 *          chapter12.section4.NoBuffer
 * @author: Tony Shen
 * @date: 2020-07-12 21:06
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {
    val time = measureTimeMillis {
        flow {
            for (i in 1..5) {
                delay(100)
                emit(i)
            }
        }
            .collect { value ->
                delay(300)
                println(value)
            }
    }
    println("Collected in $time ms")
}