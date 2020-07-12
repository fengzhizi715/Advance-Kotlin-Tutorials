package chapter12.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter12.section2.OnCompleted
 * @author: Tony Shen
 * @date: 2020-07-12 14:47
 * @version: V1.0 <描述当前版本功能>
 */
fun <T> Flow<T>.onCompleted(action: () -> Unit) = flow {

    collect { value -> emit(value) }

    action()
}

fun main() = runBlocking {
    flow {
        for (i in 1..5) {
            delay(100)
            emit(i)
        }
    }.onCompleted { println("Completed...") }
        .collect{println(it)}
}