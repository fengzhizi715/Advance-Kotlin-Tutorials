package chapter11.section4

import kotlinx.coroutines.*

/**
 *
 * @FileName:
 *          chapter11.section4.Dispatchers7
 * @author: Tony Shen
 * @date: 2021/12/16 9:06 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) = runBlocking<Unit> {

    val job = Job() // 创建一个 job 对象来管理生命周期

    launch(coroutineContext+job)  {

        delay(500)
        println("job1 is done")
    }

    launch(coroutineContext+job) {

        delay(1000)
        println("job2 is done")
    }

    launch(Dispatchers.Default+job) {

        delay(1500)
        println("job3 is done")
    }

    launch(Dispatchers.Default+job) {

        delay(2000)
        println("job4 is done")
    }

    launch(Dispatchers.Default+job) {

        delay(2500)
        println("job5 is done")
    }

    delay(1800)
    println("Cancelling the job!")
    job.cancel() // 取消任务
}