package br.com.sadock.contato

import br.com.sadock.input.OpcoesLeitura
import java.util.*

class PesquisarContato(private val contatos: MutableList<Contato>) {
    fun pesquisar() {
        val leitura = Scanner(System.`in`)
        println("Digite o nome do contato que você deseja visualizar: ")
        val nome = leitura.nextLine()

        val nomeContato = contatos.find { it.nome == nome }

        if (nomeContato != null) {
            println("Nome: ${nomeContato.nome}")
            println("Celular: ${nomeContato.celular}")
            println("Telefone: ${nomeContato.telefone}")
            println("Email: ${nomeContato.email}")
            println("--------------------")
        } else {
            println("Contato não encontrado!")
        }

        OpcoesLeitura(contatos).manipularLeitura()
    }
}