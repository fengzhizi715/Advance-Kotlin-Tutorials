package chapter2.section3

/**
 *
 * @FileName:
 *          chapter2.section3.SealedClass
 * @author: Tony Shen
 * @date: 2021/12/6 9:43 PM
 * @version: V1.0 <描述当前版本功能>
 */
sealed class Mammal(val name: String)

class Dog(dogName: String) : Mammal(dogName)
class Horse(horseName:String) :Mammal(horseName)
class Human(humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal) = when (mammal) {
    is Dog -> "Hello ${mammal.name}"
    is Horse -> "Hello ${mammal.name}"
    is Human -> "Hello ${mammal.name}, You're working as a ${mammal.job}"
}

fun main(args: Array<String>) {
    println(greetMammal(Dog("wangwang")))
    println(greetMammal(Horse("chitu")))
    println(greetMammal(Human("tony", "coder")))
}
