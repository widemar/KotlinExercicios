fun main() {
    print("Nome: ")
    val nome = readln()
    print("Valor por hora: ")
    val valorPorHora = readln().toDouble()
    print("Horas trabalhadas: ")
    val horasTrabalhadas = readln().toInt()

    val pagamento = valorPorHora * horasTrabalhadas

    print("O pagamento para $nome deve ser ${pagamento.format(2)}")
}