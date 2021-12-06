package chapter12.section1

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter12.section1.Flow6
 * @author: Tony Shen
 * @date: 2020-07-12 14:21
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    (1..5).asFlow().onEach {
        if (it == 3) throw RuntimeException("Error on $it")
    }
        .onStart { println("Starting flow") }
        .onEach { println("On each $it") }
        .catch { println("Exception : ${it.message}") }
        .onCompletion { println("Flow completed") }
        .collect()
}