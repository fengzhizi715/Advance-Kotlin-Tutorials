package chapter6.section3

/**
 *
 * @FileName:
 *          chapter6.section3.TypeProjections
 * @author: Tony Shen
 * @date: 2021/12/10 1:57 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main() {
    val list1:MutableList<String> = mutableListOf()
    list1.add("hello")
    list1.add("world")

    val list2:MutableList<out String> = mutableListOf()
//    list2.add("hello")  // compile error
//    list2.add("world")  // compile error

    val list3:MutableList<in String> = mutableListOf()
    list3.add("hello")
    list3.add("world")

    lateinit var list4:MutableList<String>
//    list4 = list3;     // compile error
}
