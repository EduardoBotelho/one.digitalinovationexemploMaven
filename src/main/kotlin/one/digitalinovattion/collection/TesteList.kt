package one.digitalinovattion.collection

fun main() {

    val Joao = Funcionario("Joao", 1000.0)
    val Pedro = Funcionario("Pedro", 2000.0)
    val Maria = Funcionario("Maria", 3000.0)

    val funcionarios = arrayOf(Joao, Pedro, Maria)

    funcionarios.forEach { println(it) }

    println(".................")
    println(funcionarios.find{it.nome == "Maria"})

    println(".................")
    funcionarios
        .sortBy { it.salario }
        funcionarios.forEach { println(it) }


}



data class Funcionario(
    val nome:String,
    val salario: Double
    ) {
    override fun toString(): String =
        """
            Nome:  $nome
            Salario: $salario
        """.trimIndent()
}



