package chapter4.section4

/**
 *
 * @FileName:
 *          chapter4.section4.Extension3
 * @author: Tony Shen
 * @date: 2021/12/8 1:34 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Extension3

val Extension3.text:String
    get() =  "this is a text property"


fun main(args: Array<String>) {
    var extension3 = Extension3()

    println(extension3.text)
}
