package chapter7.section3

import  kotlin.reflect.KFunction1

/**
 *
 * @FileName:
 *          chapter7.section3.KFunctionN2
 * @author: Tony Shen
 * @date: 2021/12/13 2:33 PM
 * @version: V1.0 <描述当前版本功能>
 */
data class User(var name:String,var password:String)

fun User.validatePassword():Boolean = this.password.length > 6

val validate:KFunction1<User,Boolean> = User::validatePassword

fun main() {

    val user = User("tony","12345")
    println(user.validatePassword())
    println(validate.invoke(user))
    println(validate.call(user))
}
