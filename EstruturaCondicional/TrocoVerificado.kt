fun main() {
    print("Preço unitário do produto: ")
    val precoUnitario = readln().toDouble()
    print("Quantidade comprada: ")
    val qtdComprada = readln().toInt()
    print("Dinheiro recebido: ")
    val dinheiroRecebido = readln().toDouble()

    val valorDaCompra = precoUnitario * qtdComprada

    val troco : Double
    if (dinheiroRecebido < valorDaCompra) {
        troco = valorDaCompra - dinheiroRecebido
        println("Dinheiro insuficiente. Faltam ${troco.format(2)} reais".uppercase())
    } else {
        troco = dinheiroRecebido - valorDaCompra
        println("Troco = ${troco.format(2)}".uppercase())
    }
}