fun main() {
    print("Digite a primeira nota: ")
    val notaUm = readln().toDouble()
    print("Digite a segunda nota: ")
    val notaDois = readln().toDouble()

    val somaNotas = notaUm + notaDois

    print(
        if (somaNotas >= 60) {
            "Nota final = ${somaNotas.format(1)}".uppercase()
        } else {
            "Nota final = ${somaNotas.format(1)}\nReprovado".uppercase()
        }
    )
}