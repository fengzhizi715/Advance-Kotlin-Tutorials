package chapter11.section4

import kotlinx.coroutines.*

/**
 *
 * @FileName:
 *          chapter11.section4.Dispatchers4
 * @author: Tony Shen
 * @date: 2021/12/16 8:57 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) = runBlocking {

    val job = launch {

        // 子协程
        val job1 = launch(coroutineContext)  {

            println("job1 is running")
            delay(1000)
            println("job1 is done")
        }

        // 子协程
        val job2 = launch(coroutineContext) {

            println("job2 is running")
            delay(1500)
            println("job2 is done")
        }

        // 子协程
        val job3 = launch(coroutineContext) {

            println("job3 is running")
            delay(2000)
            println("job3 is done")
        }

        job1.join()
        job2.join()
        job3.join()
    }

    job.join()

    println("all the jobs is complete")
}
