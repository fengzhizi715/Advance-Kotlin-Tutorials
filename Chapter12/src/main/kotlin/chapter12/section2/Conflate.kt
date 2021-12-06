package chapter12.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 *
 * @FileName:
 *          chapter12.section2.Conflate
 * @author: Tony Shen
 * @date: 2020-07-12 14:53
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    val time = measureTimeMillis {
        (1..5)
            .asFlow()
            .onStart { start = currTime() }
            .onEach {
                delay(100)
                println("Emit $it (${currTime() - start}ms) ")
            }
            .conflate()
            .collect {
                println("Collect $it starts (${currTime() - start}ms) ")
                delay(500)
                println("Collect $it ends (${currTime() - start}ms) ")
            }
    }

    println("Cost $time ms")
}