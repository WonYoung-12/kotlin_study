fun testBoxing() {
    var a = 10000
    var b = 10000
    println("a === b : ${a === b}")
    println("a == b : ${a == b}")

    var c = 10000
    var d: Int? = 10000
    println("c === d : ${c === d}")
    println("c == d : ${c == d}")
}