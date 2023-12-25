package ru.hse.kpo

import IncorrectDivisionByZero

class Calculator() {

    fun sum(numberOne: Double, numberTwo: Double): Number {
        return checkOnInt(numberOne + numberTwo)
    }

    fun difference(numberOne: Double, numberTwo: Double): Number {
        return checkOnInt(numberOne - numberTwo)
    }

    fun division(numberOne: Double, numberTwo: Double): Number {
        return if(numberTwo != 0.0) checkOnInt(numberOne / numberTwo) else throw IncorrectDivisionByZero()
    }

    fun multiplication(numberOne: Double, numberTwo: Double): Number {
        return checkOnInt(numberOne * numberTwo)
    }

    private fun checkOnInt(result: Double): Number {
        return if(result % 1 == 0.0) result.toInt() else result
    }

}

