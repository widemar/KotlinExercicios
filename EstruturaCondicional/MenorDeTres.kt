fun main() {
    print("Primeiro valor: ")
    val primeiroValor = readln().toInt()
    print("Segundo valor: ")
    val segundoValor = readln().toInt()
    print("Terceiro valor: ")
    val terceiroValor = readln().toInt()

    val menorValor =
        if (primeiroValor < segundoValor && primeiroValor < terceiroValor) {
            primeiroValor
        } else if (segundoValor < terceiroValor) {
            segundoValor
        } else {
            terceiroValor
        }

    print("Menor = $menorValor".uppercase())
}