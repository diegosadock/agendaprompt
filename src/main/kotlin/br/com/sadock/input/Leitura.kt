package br.com.sadock.input

import java.util.*

class Leitura {
    fun lerContato(): Int {
        val leitura = Scanner(System.`in`)
        println("""Escolha uma opção:
            |1 - Adicionar contato;
            |2 - Modificar contato;
            |3 - Excluir contato;
            |4 - Exibir contatos;
            |5 - Pesquisar contato;
            |6 - Sair
        """.trimMargin())
        val opcao = leitura.nextInt()

        return opcao
    }



}