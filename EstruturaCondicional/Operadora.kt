fun main() {
    print("Digite a quantidade de minutos: ")
    val quantidadeDeMinutos = readln().toInt()

    val totalPagar =
        if (quantidadeDeMinutos <= 100) {
            50.00
        } else {
            val valorDaFranquia = (quantidadeDeMinutos - 100) * 2.00
            50.00 + valorDaFranquia
        }

    print("Valor a pagar: R$ ${totalPagar.format(2)}")
}