package chapter11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 *
 * @FileName:
 *          chapter11.section2.Launch
 * @author: Tony Shen
 * @date: 2021/12/16 8:15 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) {

    val job = GlobalScope.launch {

        delay(1000)
        println("Hello Coroutines!")
    }

    Thread.sleep(2000)
}
