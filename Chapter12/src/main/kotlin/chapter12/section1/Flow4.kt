package chapter12.section1

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter12.section1.Flow4
 * @author: Tony Shen
 * @date: 2020-07-12 14:11
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    flow {
        for (i in 1..5) {
            delay(100)
            emit(i)
        }
    }.map {
        it * it
    }.flowOn(Dispatchers.IO)
        .collect {
            println("${Thread.currentThread().name}: $it")
        }
}