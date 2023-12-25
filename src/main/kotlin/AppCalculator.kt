import ru.hse.kpo.Calculator


const val inputMessageNumber: String = "Input two numbers"
const val inputMessageOperation: String = "Input operation(+, -, *, /)"
const val inputFirstNumber: String = "First number: "
const val inputSecondNumber: String = "Second number: "
const val inputOperation: String = "Operation: "
const val messageRepeat: String = "Do you want repeat use calculator?(y/n)"

val calculator = Calculator()

fun main() {
    while(true) {
        println(inputMessageNumber)
        print(inputFirstNumber)
        val numberFirst: Double? = readlnOrNull()?.toDoubleOrNull()
        if(numberFirst == null) throw IncorrectCastNumber()

        print(inputSecondNumber)
        val numberSecond: Double? = readlnOrNull()?.toDoubleOrNull()
        if(numberSecond == null) throw IncorrectCastNumber()

        println()
        println(inputMessageOperation)
        print(inputOperation)
        val operation: String? = readlnOrNull()
        println()

        println(getResult(operation, numberFirst, numberSecond).toString())

        println(messageRepeat)
        var answer: String? = null
        while(answer != "y" && answer != "n") {
            answer = readlnOrNull()
        }

        if(answer == "n") break
    }
}

fun getResult(operation: String?, numberFirst: Double, numberSecond: Double): Number {
    val result = when(operation) {
        "+" -> calculator.sum(numberFirst, numberSecond)
        "-" -> calculator.difference(numberFirst, numberSecond)
        "/" -> calculator.division(numberFirst, numberSecond)
        "*" -> calculator.multiplication(numberFirst, numberSecond)
        else -> throw IncorrectOperation()
    }
    return result
}