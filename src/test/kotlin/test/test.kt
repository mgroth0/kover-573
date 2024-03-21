package test
import main.TestApi2
import main.testFun1
import main.testFun3
import kotlin.test.Test


class Tests {
    @Test
    fun test() {
        TestApi2().testFun1()
        TestApi2().testFun3()
    }
}
