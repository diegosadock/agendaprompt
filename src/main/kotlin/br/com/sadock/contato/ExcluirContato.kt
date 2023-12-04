package br.com.sadock.contato

import br.com.sadock.input.OpcoesLeitura
import java.util.*

class ExcluirContato(private val contatos: MutableList<Contato>) {
    fun excluirContato() {
        val leitura = Scanner(System.`in`)
        println("Digite o nome do contato que você deseja excluir: ")
        val nome = leitura.nextLine()

        val nomeContato = contatos.find { it.nome == nome }

        if (nomeContato != null) {
            contatos.remove(nomeContato)
            println("O contato $nome foi removido com sucesso!")
        } else {
            println("Contato não encontrado!")
        }

        OpcoesLeitura(contatos).manipularLeitura()
    }
}