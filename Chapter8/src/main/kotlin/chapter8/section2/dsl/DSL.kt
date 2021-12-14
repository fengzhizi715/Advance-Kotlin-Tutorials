package chapter8.section2.dsl

/**
 *
 * @FileName:
 *          chapter8.section2.dsl.DSL
 * @author: Tony Shen
 * @date: 2021/12/14 2:34 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Address {

    var province: String?=null
    var city: String?=null
    var street: String?=null

    override fun toString() = "province=$province,city=$city,street=$street"
}

class User{

    var name:String?=null
    var password: String?=null
    var addresses:Address?=null

    override fun toString() = "name=$name,password=$password"
}

class UserWrapper{

    private val address = Address()

    var name:String?=null
    var password: String?=null

    fun address(init: Address.() -> Unit):Address { // 类似于 apply 函数，返回 address 对象本身

        address.init()
        return address
    }

    internal fun getAddress() = address
}

fun user(init: UserWrapper.() -> Unit):User {

    val wrapper = UserWrapper()
    wrapper.init()

    val user = User()

    user.name = wrapper.name
    user.password = wrapper.password
    user.addresses = wrapper.getAddress()

    return user
}

fun main(args: Array<String>) {

    val user =  user{

        name = "Tony"
        password = "1234567890"
        address {

            province = "Jiangsu"
            city = "Suzhou"
            street = "Renming Road"
        }
    }

    println(user.addresses)
}
