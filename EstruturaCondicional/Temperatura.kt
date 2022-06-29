fun main() {
    print("Você vai digitar a temperatura em qual escala? C ou F: ")
    when (readln().lowercase().single()) {
        'f' -> {
            print("Digite a temperatura em Fahrenheit: ")
            val fahrenheit = readln().toDouble()
            val conversaoCelsius = (fahrenheit - 32) / 1.8
            println("Temperatura equivalente em Celsius: ${conversaoCelsius.format(2)}")
        }
        'c' -> {
            print("Digite a temperatura em Celsius: ")
            val celsius = readln().toDouble()
            val conversaoFahrenheit = celsius * 1.8 + 32
            println("Temperatura equivalente em Celsius: ${conversaoFahrenheit.format(2)}")
        }
        else -> {
            println("Temperatura inválida")
        }
    }
}