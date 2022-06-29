fun main() {
    print("Digite a duração em segundos: ")
    val duracao = readln().toInt()

    val horas = duracao / 3600
    val minutos = (duracao - 3600 * horas) / 60
    val segundos = duracao - (3600 * horas + minutos * 60)

    print("$horas:$minutos:$segundos")
}