package chapter12.section3

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.retryWhen
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter12.section3.RetryWhen
 * @author: Tony Shen
 * @date: 2020-07-12 20:19
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    (1..5).asFlow().onEach {
        if (it == 3) throw RuntimeException("Error on $it")
    }
        .onEach { println("Emitting $it") }
        .retryWhen { cause, attempt ->
            attempt < 2
        }
        .catch { it.printStackTrace() }
        .collect()
}