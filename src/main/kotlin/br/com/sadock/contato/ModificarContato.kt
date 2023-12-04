package br.com.sadock.contato

import br.com.sadock.input.OpcoesLeitura
import java.util.*

class ModificarContato(private val contatos: MutableList<Contato>) {
    fun modificarContato() {
        var leitura = Scanner(System.`in`)
        println("Digite o nome do contato que você deseja modificar: ")
        var nome = leitura.nextLine()

        val nomeContato = contatos.find { it.nome == nome }

        if(nomeContato != null) {
            println("Digite o novo número de celular do contato: ")
            val novoCelular = leitura.nextLine()
            println("Digite o novo número de telefone do contato: ")
            val novoTelefone = leitura.nextLine()
            println("Digite o novo email do contato: ")
            val novoEmail = leitura.nextLine()
            println("Você deseja modificar o nome do contato? (S/N)")
            val opcao: String = leitura.nextLine()

            if(opcao.equals("S", ignoreCase = true)) {
                println("Digite o novo nome do contato: ")
                val novoNome = leitura.nextLine()
                val novoContato = ImplContato(novoNome, novoCelular, novoTelefone, novoEmail)
                contatos.remove(nomeContato)
                contatos.add(novoContato)
            } else if(opcao.equals("N", true)) {
                val novoContato = ImplContato(nome, novoCelular, novoTelefone, novoEmail)
                contatos.remove(nomeContato)
                contatos.add(novoContato)
            }

        } else {
            println("Contato não encontrado.")
        }

        OpcoesLeitura(contatos).manipularLeitura()
    }
}