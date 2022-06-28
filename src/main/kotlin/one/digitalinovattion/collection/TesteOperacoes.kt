package one.digitalinovattion.collection

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4080.0)

    for (salario in salarios){
        println(salario)
    }

    println("################")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media de salario: ${salarios.average()}")

    val salarioMaiorque2500 = salarios.filter { it > 2500 }
    salarioMaiorque2500.forEach { println(it) }
}