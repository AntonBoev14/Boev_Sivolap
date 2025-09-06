fun main(args: Array<String>) {
    println("Введите строку: ")
    val text = readln()


    if (text())
    {
        println("Вы ввели пустую строку")
    }
    var result = ""
    var currentChar = text[0]
    var count = 1

    for(i in 1 until text)
    {
        if(text[i] == currentChar)
        {
            count++
        }
        else {
            result += if (count > 1) "$currentChar$count " else "$currentChar"
            currentChar = text[i]
            count = 1
        }
    }
    result += if(count > 1)"$currentChar$count" else"$currentChar"

    println("Результат: $result ")
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}