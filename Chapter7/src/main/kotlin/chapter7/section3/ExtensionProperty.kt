package chapter7.section3

/**
 *
 * @FileName:
 *          chapter7.section3.ExtensionProperty
 * @author: Tony Shen
 * @date: 2021/12/13 2:42 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Extension

val Extension.x: Int
    get() = 1

fun main() {
    println(Extension::x) // Extension.x: kotlin.Int
    val extension = Extension()
    println(Extension::x.get(extension)) // 1
    println(Extension::x.getValue(extension,Extension::x)) // 1
}
