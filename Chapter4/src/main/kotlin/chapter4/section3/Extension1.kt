package chapter4.section3

import java.util.regex.Pattern

/**
 *
 * @FileName:
 *          chapter4.section3.Extension1
 * @author: Tony Shen
 * @date: 2021/12/8 1:29 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun String.checkEmail(): Boolean {
    val emailPattern = "[a-zA-Z0-9][a-zA-Z0-9._-]{2,16}[a-zA-Z0-9]@[a-zA-Z0-9]+.[a-zA-Z0-9]+"
    return Pattern.matches(emailPattern, this)
}

fun main(args: Array<String>) {
    println("fengzhizi715@126.com".checkEmail())
}
