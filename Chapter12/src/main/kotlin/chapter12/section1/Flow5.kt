package chapter12.section1

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull


/**
 *
 * @FileName:
 *          chapter12.section1.Flow5
 * @author: Tony Shen
 * @date: 2020-07-12 14:14
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    withTimeoutOrNull(2500) {
        flow {
            for (i in 1..5) {
                delay(1000)
                emit(i)
            }
        }.collect {
            println(it)
        }
    }

    println("Done")
}