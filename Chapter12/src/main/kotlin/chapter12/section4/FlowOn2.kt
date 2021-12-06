package chapter12.section4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Executors

/**
 *
 * @FileName:
 *          chapter12.section4.FlowOn2
 * @author: Tony Shen
 * @date: 2020-07-12 20:58
 * @version: V1.0 <描述当前版本功能>
 */
val customerDispatcher = Executors.newFixedThreadPool(5).asCoroutineDispatcher()

fun main() = runBlocking {

    flow {
        for (i in 1..5) {
            delay(100)
            emit(i)
        }
    }.map {
        it * it
    }.flowOn(Dispatchers.IO)
        .map {
            it+1
        }
        .flowOn(customerDispatcher)
        .collect {
            println("${Thread.currentThread().name}: $it")
        }
}