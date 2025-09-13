fun main()
{
    while(true)
    {
        println("1. Подсчет количества подряд идущих одинаковых символов")
        println("2. Подсчет количества различных символов и расположить их в алфавитном порядке")
        println("3. Преобразование введенного натурального числа из 10-ичной системы в двоичную ")
        println("4. Результат операции (деление, умножение, сложение, вычитание) двух вещественных чисел. Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
        println("5. Проверка существования целочисленного показателя степени x^y = n")
        println("6. Создание нечетного числа из двух цифр, введенных пользователем")
        println("0. Выход из приложения.")
        println ("Введите пункт меню:")

        val punkt = readln()

        when (punkt){
            "0" -> {
                println("Выход из приложения")
                return
            }
            "1" -> {
                println("Введите строку: ")
                val inputString = readLine() ?: ""
                val result = CharToNumber(inputString)
                println(result)
            }
            "2" ->{
                println("Введите строку: ")
                val inputString = readLine() ?: ""
                val result = countSimvols(inputString)
                println(result)
            }
            "3"->{
                println("Введите натруальное число: ")
                val number = readln().toIntOrNull()
                val result: Int = 0
                if (number != null){
                    val binary = systemScislen(number)
                    if (binary.isNotEmpty()){
                        println("Двоичное предстваление: $binary")
                    }
                    else{
                        println("Ошибка: введите корректное натуральное число")
                    }
                    println(result)
                }
            }
            "4"->{
                println("Введите выражение в формате 'ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ': ")
                val input = readln()
                calculate(input)
            }

            "5"->{

            }

            "6"->{

            }

            else -> println("Введите корректный пункт меню")
        }
    }
}
fun CharToNumber(input: String): String {
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
fun countSimvols(input: String){
    val text = readlnOrNull()?:" "
    if (text.isEmpty()){
        println("Строка пустая")
        return
    }
    println("Результат: ")
    for (char in 'A'..'Z'){
        var count = 0
        for (c in text){
            if (c == char){
                count++
            }
        }
        if(count > 0){
            println("$char - $count")
        }
    }
}
fun systemScislen(number: Int): String{
    if (number == 0) return "0"

    var n = number
    val binary = StringBuilder()

    while (n > 0) {
        binary.insert(0, n % 2)
        n /= 2
    }

    return binary.toString()
}

fun calculate(input: String){
    val parts = input.split(" ")
    if (parts.size != 3) {
        println("Ошибка: неверный формат ввода. Используйте: ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ")
        return
    }

    val num1 = parts[0].toDoubleOrNull()
    val num2 = parts[1].toDoubleOrNull()
    val operation = parts[2]

    if (num1 == null || num2 == null) {
        println("Ошибка: введите корректные числа")
        return
    }

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else null
        else -> null
    }

    if (result != null) {
        println("$result")
    } else {
        println("Ошибка: неверная операция или деление на ноль")
    }
}


