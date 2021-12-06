package chapter2.section1

/**
 *
 * @FileName:
 *          chapter2.section1.Vararg1
 * @author: Tony Shen
 * @date: 2021/12/6 1:39 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun <T> toList(vararg items: T): List<T> {
    val result = ArrayList<T>()
    for (item in items)
        result.add(item)
    return result
}

fun main(args: Array<String>) {
    val list = toList("java","kotlin","scala","groovy")
    println(list)
}