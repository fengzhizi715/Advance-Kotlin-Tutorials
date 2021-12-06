package chapter2.section1

/**
 *
 * @FileName:
 *          chapter2.section1.Vararg3
 * @author: Tony Shen
 * @date: 2021/12/6 1:40 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun <T> toList2(vararg items: T, str: String): List<String> {
    val result = ArrayList<String>()
    for (item in items)
        result.add(item.toString())

    result.add(str)
    return result
}

fun main(args: Array<String>) {
    val array = arrayOf("java", "kotlin", "scala", "groovy")
    val list = toList2(*array, str = "tony")
    println(list)
}