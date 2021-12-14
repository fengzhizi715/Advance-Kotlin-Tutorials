package chapter8.section2.dsl

/**
 *
 * @FileName:
 *          chapter8.section2.dsl.DSL3
 * @author: Tony Shen
 * @date: 2021/12/14 2:37 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Dependency {

    fun implementation(library: String) {
        println("$library")
    }

    operator fun invoke(action: Dependency.() -> Unit) {
        action()
    }
}

fun main(args: Array<String>) {

    val dependencies = Dependency()

    dependencies{

        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8::1.4.20")  // 此处省略了this指代的是dependencies，完整的应该是 this.implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8::1.4.20")
        implementation("org.jetbrains.kotlin:kotlin-reflect:1.4.20")
    }
}
