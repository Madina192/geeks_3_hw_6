fun main() {
    println(getResult(10, 7, '*'))
    println(getResult(120, 6, '/'))
}
//1
fun getResult(a : Int, b : Int, operator : Char) : Int {
    return when (operator) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> a / b
        else -> 0
    }
}

//2
