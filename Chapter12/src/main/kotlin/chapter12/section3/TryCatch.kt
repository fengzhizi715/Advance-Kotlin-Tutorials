package chapter12.section3

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter12.section3.TryCatch
 * @author: Tony Shen
 * @date: 2020-07-12 19:59
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {
    flow {
        emit(1)
        try {
            throw RuntimeException()
        } catch (e: Exception) {
            e.stackTrace
        }

    }.onCompletion { println("Done") }
        .collect { println(it) }
}