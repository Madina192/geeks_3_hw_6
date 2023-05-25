fun main(args: Array<String>) {
    println(getSum(10, 7, '*'))
}
//1
fun getSum(a : Int, b : Int, operator : Char) : Int {
    return when (operator) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> a / b
        else -> 0
    }
}

//2
