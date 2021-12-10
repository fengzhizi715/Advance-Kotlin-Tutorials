package chapter6.section1.generic

import java.lang.reflect.ParameterizedType

/**
 *
 * @FileName:
 *          chapter6.section1.generic.Generic1
 * @author: Tony Shen
 * @date: 2021/12/10 1:42 PM
 * @version: V1.0 <描述当前版本功能>
 */
object Generic1 {

    open class InnerClass<T>

    @JvmStatic
    fun main(args: Array<String>) {

        val innerClass = object : InnerClass<Int>() {

        } // 匿名内部类的声明在编译时进行，实例化在运行时进行

        val typeClass = innerClass.javaClass.genericSuperclass
        println(typeClass)

        if (typeClass is ParameterizedType) {

            val actualType = typeClass.actualTypeArguments[0]
            println(actualType)
        }
    }
}