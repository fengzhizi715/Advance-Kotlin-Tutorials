package chapter4.section3

/**
 *
 * @FileName:
 *          chapter4.section3.Polymorphic
 * @author: Tony Shen
 * @date: 2021/12/8 1:30 PM
 * @version: V1.0 <描述当前版本功能>
 */
open class Base

class Child: Base()

fun Base.foo() = println("this is from base") // 父类的扩展函数 foo

fun Child.foo() = println("this is from child") // 子类的扩展函数 foo

fun executeFoo(base: Base) = base.foo()

fun main(args: Array<String>) {
    var base = Base()
    var child = Child()

    executeFoo(base)
    executeFoo(child)
}
