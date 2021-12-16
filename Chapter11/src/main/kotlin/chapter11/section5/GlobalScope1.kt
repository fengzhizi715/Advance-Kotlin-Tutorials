package chapter11.section5

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 *
 * @FileName:
 *          chapter11.section5.GlobalScope1
 * @author: Tony Shen
 * @date: 2021/12/16 9:10 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main() {

    GlobalScope.launch {

        throw RuntimeException("this is an exception")
        "doSomething..."
    }

    Thread.sleep(5000)
}
