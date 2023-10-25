fun defineTotalNumberOfElements() {
    val greenNumbers = listOf(1, 4, 23)
    val redNumbers = listOf(17, 2)
    println(greenNumbers.count() + redNumbers.count())
}

fun checkProtocolSupport(protocol: String) {
    val supported = setOf("HTTP", "HTTPS", "FTP")
    val isSupported = protocol.uppercase() in supported
    println("Support for $protocol: $isSupported")
}

fun mapNumberToStringName(n: Int) {
    val number2word = mapOf(1 to "one", 2 to "two", 3 to "three")
    println("$n is spelt as '${number2word[n]}'")
}

fun main() {
    defineTotalNumberOfElements()
    checkProtocolSupport("smtp")
    mapNumberToStringName(2)
}