package chapter6.section3

/**
 *
 * @FileName:
 *          chapter6.section3.StarProjections
 * @author: Tony Shen
 * @date: 2021/12/10 1:55 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main() {
    val list1 = mutableListOf<String>()
    list1.add("string1")
    list1.add("string2")
    printList(list1)

    val list2 = mutableListOf<Int>()
    list2.add(123)
    list2.add(456)
    printList(list2)
}

fun printList(list: MutableList<*>) {

    println(list[0])
}
