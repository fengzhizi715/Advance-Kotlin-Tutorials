package chapter8.section2

import org.junit.Test

/**
 *
 * @FileName:
 *          chapter8.section2.AssertionTest
 * @author: Tony Shen
 * @date: 2021/12/14 2:48 PM
 * @version: V1.0 <描述当前版本功能>
 */
class AssertionTest {

    @Test
    fun unitTestingWorks(){

        val result = Assertion(10)

        result isEqualTo 10
        result isDifferentFrom 11
    }
}
