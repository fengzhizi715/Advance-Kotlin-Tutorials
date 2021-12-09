package chapter5.section2

import kotlin.reflect.KProperty

/**
 *
 * @FileName:
 *          chapter5.section2.Delegate3
 * @author: Tony Shen
 * @date: 2021/12/9 1:27 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "${property.name}: $thisRef"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("value=$value")
    }
}

class User {
    var name: String by Delegate()
    var password:String by Delegate()
}

fun main(args: Array<String>) {

    val u = User()

    println(u.name)
    u.name = "Tony"

    println(u.password)
    u.password = "123456"
}
