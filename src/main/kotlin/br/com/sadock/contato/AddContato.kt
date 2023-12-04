package br.com.sadock.contato

import br.com.sadock.input.OpcoesLeitura
import java.util.*

class AddContato(private val contatos: MutableList<Contato>) {

    fun adicionarContato() {
        val leitura = Scanner(System.`in`)
        println("Digite o nome do contato: ")
        val nome = leitura.nextLine()
        println("Digite o número de celular do contato: ")
        val celular = leitura.nextLine()
        println("Digte o número de telefone do contato: ")
        val telefone = leitura.nextLine()
        println("Digite o email do contato: ")
        val email = leitura.nextLine()

        val contato = ImplContato(nome, celular, telefone, email)
        contatos.add(contato)

        OpcoesLeitura(contatos).manipularLeitura()

    }
}