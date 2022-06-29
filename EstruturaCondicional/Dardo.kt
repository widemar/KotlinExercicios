fun main() {
    println("Digite as três distância: ")
    val distanciaUm = readln().toDouble()
    val distanciaDois = readln().toDouble()
    val distanciaTres = readln().toDouble()

    val maior = maxOf(distanciaUm, distanciaDois, distanciaTres)

    print("Maior distância = ${maior.format(2)}".uppercase())
}