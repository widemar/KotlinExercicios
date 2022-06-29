fun main() {
    print("Preço unitário do produto: ")
    val precoUnitario = readln().toDouble()
    print("Quantidade comprada: ")
    val quantidadeComprada = readln().toInt()
    print("Dinheiro recebido: ")
    val dinheiroRecebido = readln().toDouble()

    val troco = dinheiroRecebido - precoUnitario * quantidadeComprada

    print("Troco = ${troco.format(2)}".uppercase())
}