class IncorrectCastNumber(
    cause: Throwable? = null
) : Exception(cause) {

    override val message: String
        get() = "You didn't enter the number"
}

class IncorrectDivisionByZero(
    cause: Throwable? = null
) : Exception(cause) {

    override val message: String
        get() = "DivisionByZero"
}


class IncorrectOperation(
    cause: Throwable? = null
) : Exception(cause) {

    override val message: String
        get() = "Incorrect operation"
}