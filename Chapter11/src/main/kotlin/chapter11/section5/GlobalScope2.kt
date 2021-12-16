package chapter11.section5

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

/**
 *
 * @FileName:
 *          chapter11.section5.GlobalScope2
 * @author: Tony Shen
 * @date: 2021/12/16 9:10 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun doSomething(): Deferred<String> = GlobalScope.async {

    throw RuntimeException("this is an exception")
    "doSomething..."
}

fun main() {

    try {
        GlobalScope.launch {
            doSomething().await()
        }
    } catch (e:Exception) {

    }

    Thread.sleep(5000)
}
