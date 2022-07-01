package one.digitalinovattion.collection

fun main() {
    val Joao = Funcionario("Joao", 1000.0, "CLT")
    val Pedro = Funcionario("Pedro", 2000.0,"PJ")
    val Maria = Funcionario("Maria", 3000.0,"CLT")

    val funcionarios = mutableListOf(Joao, Pedro, Maria) // lista mutavel pode ser alterada sempre
        funcionarios.forEach{ println(it) }

    println("..............")
    funcionarios.add(Pedro)
    funcionarios.forEach{ println(it) }

    println("..............")
    funcionarios.remove(Joao)
    funcionarios.forEach{ println(it) }

    println("......SET......")
    val funcionarioSet = mutableSetOf(Joao)
    funcionarioSet.forEach { println(it) }

    println("..............")
    funcionarios.add(Pedro)
    funcionarios.add(Maria)
    funcionarioSet.forEach{ println(it) }

    println("..............")
    funcionarioSet.remove(Maria)
    funcionarioSet.forEach { println(it) }

}