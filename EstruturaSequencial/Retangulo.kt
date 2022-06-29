import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Base do retângulo: ")
    val base = readln().toDouble()
    print("Altura do retângulo: ")
    val altura = readln().toDouble()

    val area = base * altura
    val perimetro = 2 * (base + altura)
    val diagonal = sqrt(base.pow(2.0) + altura.pow(2.0))

    println("Area = ${area.format(4)}".uppercase())
    println("Perímetro = ${perimetro.format(4)}".uppercase())
    println("Diagonal = ${diagonal.format(4)}".uppercase())
}