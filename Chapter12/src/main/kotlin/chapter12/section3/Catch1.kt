package chapter12.section3

import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter12.section3.Catch1
 * @author: Tony Shen
 * @date: 2020-07-12 20:10
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {
    flow {
        emit(1)
        throw RuntimeException()
    }
        .onCompletion { cause ->
            if (cause != null)
                println("Flow completed exceptionally")
            else
                println("Done")
        }
        .catch{ println("catch exception") }
        .collect { println(it) }
}