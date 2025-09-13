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
    if (input.isEmpty()){
        println("Строка пустая")
        return
    }
    val charCount =
}


