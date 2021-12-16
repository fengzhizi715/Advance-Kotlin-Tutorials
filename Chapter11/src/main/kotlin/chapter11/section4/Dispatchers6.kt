package chapter11.section4

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 *
 * @FileName:
 *          chapter11.section4.Dispatchers6
 * @author: Tony Shen
 * @date: 2021/12/16 9:00 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) {

    val job = GlobalScope.launch {

        val childJob = GlobalScope.launch(Dispatchers.Default + coroutineContext) {
            println("childJob: I am a child of the job coroutine, but with a different dispatcher")
            delay(1000)
            println("childJob: I will not execute this line if job is cancelled")
        }

        childJob.join()
    }
    Thread.sleep(500)
    job.cancel() // 取消请求
    Thread.sleep(2000)
}
