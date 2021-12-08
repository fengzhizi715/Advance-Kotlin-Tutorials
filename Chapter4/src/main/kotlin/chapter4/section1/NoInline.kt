package chapter4.section1

/**
 *
 * @FileName:
 *          chapter4.section1.NoInline
 * @author: Tony Shen
 * @date: 2021/12/8 1:26 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun doSomething1() {
    println("do something with inline")
}

fun doSomething2() {
    println("do something with noinline")
}

inline fun noinlineExample(something1: () -> Unit, noinline something2: () -> Unit) {
    something1.invoke()
    something2.invoke()
}

fun main(args: Array<String>) {
    noinlineExample(
        ::doSomething1,
        ::doSomething2
    )
}
