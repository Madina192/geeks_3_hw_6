fun main() {
    println(getResult(10, 7, '*'))
    println(getResult(120, 6, '/'))
    println(getResult(40, 25, '+'))
    println(getResult(95, 15, '-'))
    println("PROBLEM #2 ---------")
    println(getName())
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
fun getName() : String {
    val names = arrayOf("Regina", "Joodar", "Akmaral", "Habib", "Jibek", "Aruuzat")
    val myName = "madina"
    var isWordFound : Boolean
    var emptyString = ""
    for (i in myName.indices) {
        for (word in names) {
            isWordFound = false
            for (k in word.indices) {
                if (myName[i] == word[k]) {
                    emptyString += word[k]
                    isWordFound = true
                    break
                }
            }
            if (isWordFound) {
                break
            }
        }
    }
    return emptyString
}