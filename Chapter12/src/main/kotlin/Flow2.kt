import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 *
 * @FileName:
 *          .Flow2
 * @author: Tony Shen
 * @date: 2020-07-12 14:06
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    val time = measureTimeMillis{
        channelFlow {
            for (i in 1..5) {
                delay(100)
                send(i)
            }
        }.collect{
            delay(100)
            println(it)
        }
    }

    print("cost $time")
}