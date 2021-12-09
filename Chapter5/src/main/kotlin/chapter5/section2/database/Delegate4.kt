package chapter5.section2.database

/**
 *
 * @FileName:
 *          chapter5.section2.database.Delegate4
 * @author: Tony Shen
 * @date: 2021/12/9 1:34 PM
 * @version: V1.0 <描述当前版本功能>
 */
fun main(args: Array<String>) {

    val tony = User(1)

    println("tony.password="+tony.password)

    println("---------------------------")

    tony.password = "P@ssword"

    println("---------------------------")

    println("tony.password="+tony.password)
}
