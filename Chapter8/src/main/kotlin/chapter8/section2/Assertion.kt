package chapter8.section2

import org.junit.Assert

/**
 *
 * @FileName:
 *          chapter8.section2.Assertion
 * @author: Tony Shen
 * @date: 2021/12/14 2:39 PM
 * @version: V1.0 <描述当前版本功能>
 */
class Assertion<T>(private val target: T) {

    infix fun isEqualTo(other: T) {
        Assert.assertEquals(other, target)
    }

    infix fun isDifferentFrom(other: T) {
        Assert.assertNotEquals(other, target)
    }
}
