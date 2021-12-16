package chapter11.section1

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 *
 * @FileName:
 *          chapter11.section1.Coroutines
 * @author: Tony Shen
 * @date: 2021/12/16 8:07 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) {

    val start = System.currentTimeMillis()

    runBlocking {
        val jobs = List(100000) {
            // 创建新的coroutine
            launch(Dispatchers.Default) {
                // 挂起当前上下文而非阻塞1000ms
                delay(1000)
                println("thread name="+Thread.currentThread().name)
            }
        }

        jobs.forEach {
            it.join()
        }
    }

    val spend = (System.currentTimeMillis()-start)/1000

    println("Coroutines: spend= $spend s")

}