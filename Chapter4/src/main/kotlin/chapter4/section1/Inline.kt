package chapter4.section1

/**
 *
 * @FileName:
 *          chapter4.section1.Inline
 * @author: Tony Shen
 * @date: 2021/12/8 1:25 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun nonInlined(block: () -> Unit) { // 不用内联的函数
    block()
}

inline fun inlined(block: () -> Unit) { // 使用内联的函数
    block()
}

fun main(args: Array<String>) {
    nonInlined {
        println("do something with nonInlined")
    }

    inlined {
        println("do something with inlined")
    }
}
