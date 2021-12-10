package chapter6.section1.generic

import java.lang.reflect.ParameterizedType

/**
 *
 * @FileName:
 *          chapter6.section1.generic.Generic2
 * @author: Tony Shen
 * @date: 2021/12/10 1:44 PM
 * @version: V1.0 <描述当前版本功能>
 */
object Generic2 {

    @JvmStatic
    fun main(args: Array<String>) {

        val child = GenericChild()
        child.printType()
    }
}

open class Father<T>

class GenericChild : Father<String>() {

    fun printType() {

        val genType = javaClass.genericSuperclass
        println(genType)
        val params = (genType as ParameterizedType).actualTypeArguments[0]
        println(params)
    }
}
