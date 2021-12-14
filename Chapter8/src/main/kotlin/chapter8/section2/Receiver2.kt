package chapter8.section2

/**
 *
 * @FileName:
 *          chapter8.section2.Receiver2
 * @author: Tony Shen
 * @date: 2021/12/14 2:33 PM
 * @version: V1.0 <描述当前版本功能>
 */
class User{

    var name:String?=null
    var password: String?=null

    override fun toString(): String {
        return "name=$name,password=$password"
    }
}

fun main(args: Array<String>) {

    val user = User().apply {

        name = "Tony"  // 此处省略了this，完整的应该是this.name= "Tony"
        password = "123456"
    }

    println(user)
}
