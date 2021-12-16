package chapter11.section1

import kotlin.concurrent.thread

/**
 *
 * @FileName:
 *          chapter11.section1.Thread
 * @author: Tony Shen
 * @date: 2021/12/16 8:10 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) {

    val start = System.currentTimeMillis()

    val threads = List(100000) {
        // 创建新的线程
        thread {
            Thread.sleep(1000)
            println(Thread.currentThread().name)
        }
    }

    threads.forEach { it.join() }

    val spend = (System.currentTimeMillis()-start)/1000

    println("Threads: spend= $spend s")

}