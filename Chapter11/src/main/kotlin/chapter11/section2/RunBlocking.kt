package chapter11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter11.section2.RunBlocking
 * @author: Tony Shen
 * @date: 2021/12/16 8:22 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) = runBlocking {

    launch {
        delay(1000)
        println("Hello World!")
    }

    delay(2000)
}