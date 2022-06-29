fun main() {
    print("Primeiro valor: ")
    val primeiroValor = readln().toInt()
    print("Segundo valor: ")
    val segundoValor = readln().toInt()
    print("Terceiro valor: ")
    val terceiroValor = readln().toInt()

    val menorValor = minOf(primeiroValor, segundoValor, terceiroValor)

    print("Menor = $menorValor".uppercase())
}