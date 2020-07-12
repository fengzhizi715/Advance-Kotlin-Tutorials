import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

/**
 *
 * @FileName:
 *          .Flow1
 * @author: Tony Shen
 * @date: 2020-07-12 13:56
 * @version: V1.0 <描述当前版本功能>
 */
fun main() = runBlocking {

    val time = measureTimeMillis {
        flow {
            for (i in 1..5) {
                delay(100)
                emit(i)
            }
        }.collect{
            delay(100)
            println(it)
        }
    }

    print("cost $time")
}