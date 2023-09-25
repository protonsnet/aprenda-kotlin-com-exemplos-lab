// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { 
    BASICO, 
    INTERMEDIARIO, 
    AVANÇADO 
}

data class Usuario(val nome: String, val idade: Int)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

val disciplina = listOf(
    	ConteudoEducacional("FMC 1", 90),
        ConteudoEducacional("Calculo 1", 60),
        ConteudoEducacional("FMC 2", 60),
        ConteudoEducacional("Probabilidade", 60),
    )


fun getConteudo(): List<ConteudoEducacional> = disciplina

class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
       inscritos.add(usuario)
        
    }
}

fun main() {
    val usuario = listOf(
        Usuario("José", 30),
        Usuario("Maria", 25),
        Usuario("Carlos", 20),
        Usuario("Pedro", 38),
    )
    
    val disc = getConteudo()
    
	var formacao = Formacao("TI", disc)
    
    val u1 = usuario[1]
    val u2 = usuario[0]
    
    formacao.matricular(u1)
    formacao.matricular(u2)

    println("Usuários cadastrados:")
    usuario.forEach{
        println(it.nome)
    }
    
    println("\nDisciplinas")
    disciplina.forEach{
        println(it.nome)
    }
    
    println("\nFormação")
    formacao.inscritos.forEach{
        println(it.nome)
    }
    
}