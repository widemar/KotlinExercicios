import kotlin.math.pow

fun main() {
    print("Digite a medida A: ")
    val a = readln().toDouble()
    print("Digite a medida B: ")
    val b = readln().toDouble()
    print("Digite a medida C: ")
    val c = readln().toDouble()

    val areaQuadrado = a.pow(2)
    val areaTriangulo = a * b / 2
    val areaTrapezio = (a + b) * c / 2

    println("Area do quadrado = ${areaQuadrado.format(4)}".uppercase())
    println("Area do triângulo = ${areaTriangulo.format(4)}".uppercase())
    println("Area do trapézio = ${areaTrapezio.format(4)}".uppercase())
}