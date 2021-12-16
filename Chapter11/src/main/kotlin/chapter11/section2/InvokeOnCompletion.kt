package chapter11.section2

import kotlinx.coroutines.*

/**
 *
 * @FileName:
 *          chapter11.section2.InvokeOnCompletion
 * @author: Tony Shen
 * @date: 2021/12/16 8:20 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main() {

    GlobalScope.launch {

        val  result = async{

            delay(2000)
            1
        }

        result.invokeOnCompletion {

            if (it!=null){

                println("exception: ${it.message}")
            } else {

                println("result is complete")
            }
        }

        result.cancelAndJoin()

        println(result.await())
    }

    Thread.sleep(5000)
}
