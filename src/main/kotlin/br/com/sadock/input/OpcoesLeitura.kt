package br.com.sadock.input

import br.com.sadock.contato.*

class OpcoesLeitura(private val contatos: MutableList<Contato>) {

    fun manipularLeitura() {

        when(Leitura().lerContato()) {
            1 -> AddContato(contatos).adicionarContato()
            2 -> ModificarContato(contatos).modificarContato()
            3 -> ExcluirContato(contatos).excluirContato()
            4 -> ExibirContatos(contatos).imprimirContatos()
            5 -> PesquisarContato(contatos).pesquisar()

        }
    }




}