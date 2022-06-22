package one.digitalinovattion.collection

fun main() {
    val nomes = Array<String>(size = 3){""}
    nomes[0] ="Maria"
    nomes[1] = "Zetti"
    nomes[2] = "Jose"

    for (nome in nomes){
        println(nome)
    }

    println("##################")
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "Zetti", "Jose")

    println("########################")

    nomes2.sort()
    nomes2.forEach{println(it)}
}
