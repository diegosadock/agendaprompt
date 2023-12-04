package br.com.sadock.contato

import br.com.sadock.input.OpcoesLeitura

class ExibirContatos(private val contatos: MutableList<Contato>) {
    fun imprimirContatos() {
        contatos.forEach { contato ->
            println("Nome: ${contato.nome}")
            println("Celular: ${contato.celular}")
            println("Telefone: ${contato.telefone}")
            println("Email: ${contato.email}")
            println("--------------------")

            OpcoesLeitura(contatos).manipularLeitura()
        }

        if(contatos.isEmpty()) {
            println("A lista de contatos está vazia!")
            OpcoesLeitura(contatos).manipularLeitura()
        }
    }
}