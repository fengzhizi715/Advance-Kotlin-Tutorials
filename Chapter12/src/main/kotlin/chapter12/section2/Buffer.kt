package chapter12.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 *
 * @FileName:
 *          chapter12.section2.Buffer
 * @author: Tony Shen
 * @date: 2020-07-12 14:51
 * @version: V1.0 <描述当前版本功能>
 */
fun currTime() = System.currentTimeMillis()

var start: Long = 0

fun main() = runBlocking {

    val time = measureTimeMillis {
        (1..5)
            .asFlow()
            .onStart { start = currTime() }
            .onEach {
                delay(100)
                println("Emit $it (${currTime() - start}ms) ")
            }
            .buffer()
            .collect {
                println("Collect $it starts (${currTime() - start}ms) ")
                delay(500)
                println("Collect $it ends (${currTime() - start}ms) ")
            }
    }

    println("Cost $time ms")
}