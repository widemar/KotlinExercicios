import kotlin.math.pow

fun main() {
    val pi = 3.14159
    print("Digite o valor do raio do círculo: ")
    val raio = readln().toDouble()

    val area = pi * raio.pow(2)

    print("Area = ${area.format(3)}".uppercase())

}