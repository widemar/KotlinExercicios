import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Coeficiente a: ")
    val conficienteA = readln().toDouble()
    print("Coeficiente b: ")
    val conficienteB = readln().toDouble()
    print("Coeficiente c: ")
    val conficienteC = readln().toDouble()

    val delta = conficienteB.pow(2) - 4 * conficienteA * conficienteC
    val x1 = (-conficienteB + sqrt(delta)) / (2 * conficienteA)
    val x2 = (-conficienteB - sqrt(delta)) / (2 * conficienteA)

    if (delta < 0.0) {
        print("Está equação não possui raízes reais.")
    } else {
        println("X1 = ${x1.format(4)}")
        println("X2 = ${x2.format(4)}")
    }

}