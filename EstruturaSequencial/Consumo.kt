fun main() {
    print("Distancia percorrida: ")
    val distancia = readln().toInt()
    print("Combustível gasto: ")
    val combustivelGasto = readln().toDouble()

    val consumoMedio = distancia / combustivelGasto

    print("Consumo médio = ${consumoMedio.format(3)}")
}