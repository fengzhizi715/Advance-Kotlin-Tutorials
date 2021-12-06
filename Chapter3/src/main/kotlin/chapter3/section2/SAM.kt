package chapter3.section2

/**
 *
 * @FileName:
 *          chapter3.section2.SAM
 * @author: Tony Shen
 * @date: 2021/12/7 1:21 AM
 * @version: V1.0 <描述当前版本功能>
 */
fun interface Action {
    fun run()
}

fun runAction(a: Action) = a.run()

fun main() {
    // 传递一个对象
    runAction(object : Action{
        override fun run() {
            println("run action")
        }
    })

    // 支持 SAM
    runAction {
        println("Hello, Kotlin 1.4!")
    }
}
