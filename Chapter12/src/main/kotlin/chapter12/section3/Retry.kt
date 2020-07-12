package chapter12.section3

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.retry
import kotlinx.coroutines.runBlocking


/**
 *
 * @FileName:
 *          chapter12.section3.Retry
 * @author: Tony Shen
 * @date: 2020-07-12 20:17
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    (1..5).asFlow().onEach {
        if (it == 3) throw RuntimeException("Error on $it")
    }.retry(2) {

        if (it is RuntimeException) {
            return@retry true
        }
        false
    }
        .onEach { println("Emitting $it") }
        .catch { it.printStackTrace() }
        .collect()
}