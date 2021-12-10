package chapter6.section2

/**
 *
 * @FileName:
 *          chapter6.section2.Covariance
 * @author: Tony Shen
 * @date: 2021/12/10 1:50 PM
 * @version: V1.0 协变的例子
 */
open class Animal
class Dog:Animal()

fun main() {

    var animals: List<Animal> = ArrayList()
    val dogs = ArrayList<Dog>()
    animals = dogs
}
