package chapter12.section4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flatMapMerge
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter12.section4.FlatMapMerge
 * @author: Tony Shen
 * @date: 2020-07-12 22:13
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    val result = arrayListOf<Int>()
    for (index in 1..100){
        result.add(index)
    }

    result.asFlow()
        .flatMapMerge {
            flow {
                emit(it)
            }
                .flowOn(Dispatchers.IO)
        }
        .collect { println("$it") }
}