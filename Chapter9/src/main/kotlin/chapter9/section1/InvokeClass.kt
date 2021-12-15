package chapter9.section1

/**
 *
 * @FileName:
 *          chapter9.section1.InvokeClass
 * @author: Tony Shen
 * @date: 2021/12/15 8:39 PM
 * @version: V1.0 <描述当前版本功能>
 */
class InvokeClass{

    var sum:Int = 0

    operator fun invoke(param: Int){

        sum += param
        println("print in invoke method, param is $param, the sum = $sum")
    }

    operator fun invoke(param1: Int, param2: Int): InvokeClass{

        sum += param1 + param2

        println("print in invoke method, param1 is $param1, param2 is $param2, the sum = $sum")

        return this
    }
}


fun main(args: Array<String>) {

    val obj = InvokeClass()

    obj.invoke(4)
    obj(4)
    obj(5,6)(7,8)(9)

    println(obj.sum)
}
