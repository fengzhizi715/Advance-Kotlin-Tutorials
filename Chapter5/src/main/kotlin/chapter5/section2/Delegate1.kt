package chapter5.section2

/**
 *
 * @FileName:
 *          chapter5.section2.Delegate1
 * @author: Tony Shen
 * @date: 2021/12/9 1:26 PM
 * @version: V1.0 <描述当前版本功能>
 */
// 创建接口
interface Base {
    fun print()
}

// 实现此接口的被委托的类
class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

// 通过关键字 by 完成委托，Derived 相当于代理类
class Derived(b: Base) : Base by b

fun main(args: Array<String>) {
    val base = BaseImpl(10)
    Derived(base).print() // 输出 10
}
