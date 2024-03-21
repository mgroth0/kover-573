package main

class TestApi2 {
    fun debug(op: () -> Unit) {
        op()
    }
}

fun TestApi2.testFun1() {
    println("hello test fun 1")
    debug {
        println("hello test fun 1 lambda")
    }
}

inline fun TestApi2.testFun3() {
    println("hello test fun 2")
    debug {
        println("hello test fun 2 lambda")
    }
}

