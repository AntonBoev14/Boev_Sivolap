fun main()
{
    println("Введите строку: ")
    val inputString = readLine() ?: ""
    val result = compressString(inputString)
    println(result)
}

fun compressString(input: String): String {
    if (input.isEmpty()) {
        return ""
    }

    val result = StringBuilder()
    var currentChar = input[0]
    var count = 1

    for (i in 1 until input.length) {
        if (input[i] == currentChar) {
            count++
        } else {
            result.append(currentChar)
            if (count > 1) {
                result.append(count)
            }
            currentChar = input[i]
            count = 1
        }
    }
    result.append(currentChar)
    if (count > 1) {
        result.append(count)
    }
    return result.toString()
}



