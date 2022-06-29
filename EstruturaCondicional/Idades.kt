fun main() {
    println("Dados da primeira pessoa: ")
    print("Nome: ")
    val nomeUm = readln()
    print("Idade: ")
    val idadeUm = readln().toInt()
    println("Dados da segunda pessoa: ")
    print("Nome: ")
    val nomeDois = readln()
    print("Idade: ")
    val idadeDois = readln().toInt()

    val idadeMedia = (idadeUm + idadeDois) / 2.0

    print("A idade média de $nomeUm e $nomeDois é de ${idadeMedia.format(1)} anos")
}