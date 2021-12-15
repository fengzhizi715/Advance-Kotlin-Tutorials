package chapter9.section6

/**
 *
 * @FileName:
 *          chapter9.section6.StatePattern
 * @author: Tony Shen
 * @date: 2021/12/15 9:22 PM
 * @version: V1.0 <描述当前版本功能>
 */
interface State {
    fun next(): State
}

sealed class SemaphoreStates : State {

    object Red : SemaphoreStates() {
        override fun next() = Green
    }

    object Green : SemaphoreStates() {
        override fun next() = Yellow
    }

    object Yellow : SemaphoreStates() {
        override fun next() = Red
    }
}

class Semaphore(startingState: State = SemaphoreStates.Red) {
    var state = startingState
        private set

    fun nextLight() {
        state = state.next()
    }

    fun getCurrentSateName():String = state.javaClass.simpleName
}

fun Semaphore.canCross() = this.state is SemaphoreStates.Green

fun main() {

    val semaphore = Semaphore()

    println("${semaphore.getCurrentSateName()},can cross:${semaphore.canCross()}")

    semaphore.nextLight()

    println("${semaphore.getCurrentSateName()},can cross:${semaphore.canCross()}")

    semaphore.nextLight()

    println("${semaphore.getCurrentSateName()},can cross:${semaphore.canCross()}")

    semaphore.nextLight()

    println("${semaphore.getCurrentSateName()},can cross:${semaphore.canCross()}")

    semaphore.nextLight()

    println("${semaphore.getCurrentSateName()},can cross:${semaphore.canCross()}")
}
