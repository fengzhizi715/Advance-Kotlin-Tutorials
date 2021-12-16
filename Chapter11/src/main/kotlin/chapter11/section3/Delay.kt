package chapter11.section3

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter11.section3.Delay
 * @author: Tony Shen
 * @date: 2021/12/16 8:24 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) = runBlocking{

    println("1: current thread is ${Thread.currentThread().name}")

    GlobalScope.launch {

        println("3: current thread is ${Thread.currentThread().name}")

        delay(1000L)

        println("4: current thread is ${Thread.currentThread().name}")
    }

    println("2: current thread is ${Thread.currentThread().name}")

    Thread.sleep(2000L)

    println("5: current thread is ${Thread.currentThread().name}")
}
