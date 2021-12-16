package chapter11.section4

import kotlinx.coroutines.*

/**
 *
 * @FileName:
 *          chapter11.section4.Dispatchers3
 * @author: Tony Shen
 * @date: 2021/12/16 8:56 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) {

    // 创建一个协程，并在内部再创建两个协程
    val job = GlobalScope.launch {

        // 第一个使用不同的上下文
        val job1 = GlobalScope.launch {

            println("job1: I have my own context and execute independently!")
            delay(1000)
            println("job1: I am not affected by cancellation of the job")
        }

        // 第二个继承父级上下文
        val job2 = launch(coroutineContext) {

            println("job2: I am a child of the job coroutine")
            delay(1000)
            println("job2: I will not execute this line if my parent job is cancelled")
        }

        job1.join()
        job2.join()
    }

    Thread.sleep(500)

    job.cancel() // 取消job

    Thread.sleep(2000)
}
