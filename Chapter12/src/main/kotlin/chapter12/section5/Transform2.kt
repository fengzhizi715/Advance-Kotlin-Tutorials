package chapter12.section5

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter12.section5.Transform2
 * @author: Tony Shen
 * @date: 2020-07-12 22:23
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    (1..5).asFlow()
        .transform {
            emit(it * 2)
            delay(100)
            emit("emit $it")
        }
        .collect { println(it) }
}