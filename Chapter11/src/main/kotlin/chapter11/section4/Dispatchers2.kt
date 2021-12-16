package chapter11.section4

import kotlinx.coroutines.*

/**
 *
 * @FileName:
 *          chapter11.section4.Dispatchers2
 * @author: Tony Shen
 * @date: 2021/12/16 8:51 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) = runBlocking(Dispatchers.Default) {

    val jobs = ArrayList<Job>()

    jobs += launch(Dispatchers.Unconfined) { // 无限制
        println("'Unconfined': I'm working in thread ${Thread.currentThread().name}")
        delay(500)
        println("'Unconfined': After delay in thread ${Thread.currentThread().name}")
    }

    jobs += launch(coroutineContext) { // 使用父级的上下文，也就是 runBlocking 的上下文
        println("'coroutineContext': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch(Dispatchers.Default) {
        println("'Dispatchers.Default': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch {
        println("'default': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs += launch(newSingleThreadContext("MyThread")) { // 创建自己的新线程
        println("'MyThread': I'm working in thread ${Thread.currentThread().name}")
    }

    jobs.forEach { it.join() }
}
