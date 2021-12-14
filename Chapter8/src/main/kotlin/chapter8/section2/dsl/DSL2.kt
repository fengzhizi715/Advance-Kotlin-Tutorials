package chapter8.section2.dsl

/**
 *
 * @FileName:
 *          chapter8.section2.dsl.DSL2
 * @author: Tony Shen
 * @date: 2021/12/14 2:36 PM
 * @version: V1.0 <描述当前版本功能>
 */
operator fun String.invoke(fn: String.() -> Unit) {
    fn(this)
}

fun main(args: Array<String>) {

    "hello dsl" { // 此处省略了.invoke

        println(this)
    }
}
