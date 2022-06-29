fun main() {
    print("Insira a largura do terreno: ")
    val largura = readln().toDouble()
    print("Insira o comprimento do terreno: ")
    val comprimento = readln().toDouble()
    print("Insira o valor do metro quadrado: ")
    val valorDoMetroQuadrado = readln().toDouble()

    val areaDoTerreno = largura * comprimento
    val precoDoTerreno = areaDoTerreno * valorDoMetroQuadrado

    println("Área do terreno = ${areaDoTerreno.format(2)}")
    println("Preço do terreno = ${precoDoTerreno.format(2)}")
}