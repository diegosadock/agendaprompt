package br.com.sadock.main

import br.com.sadock.contato.Contato
import br.com.sadock.input.OpcoesLeitura

fun main() {
    val contatos: MutableList<Contato> = mutableListOf()
    OpcoesLeitura(contatos).manipularLeitura()
}