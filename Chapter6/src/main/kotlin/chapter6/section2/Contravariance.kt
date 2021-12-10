package chapter6.section2

/**
 *
 * @FileName:
 *          chapter6.section2.Contravariance
 * @author: Tony Shen
 * @date: 2021/12/10 1:52 PM
 * @version: V1.0 逆变的例子
 */
abstract class Printer<in E> {

    abstract fun print(value: E): Unit
}

class AnimalPrinter: Printer<Animal>() {

    override fun print(animal: Animal) {
        println("this is animal")
    }
}

class DogPrinter : Printer<Dog>() {

    override fun print(dog: Dog) {
        println("this is dog")
    }
}

fun main() {

    val animalPrinter = AnimalPrinter()
    animalPrinter.print(Animal())

    val dogPrinter = DogPrinter()
    dogPrinter.print(Dog())
}
