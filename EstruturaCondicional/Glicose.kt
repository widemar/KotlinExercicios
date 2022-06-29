fun main() {
    print("Digite a medida da glicose: ")
    val glicose = readln().toDouble()

    val classificao =
        when {
            glicose <= 100 -> {
                "normal"
            }
            glicose <= 140 -> {
                "elevado"
            }
            else -> {
                "diabetes"
            }
        }

    print("Classificação: $classificao")
}