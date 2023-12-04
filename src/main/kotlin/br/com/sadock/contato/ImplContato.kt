package br.com.sadock.contato

class ImplContato(
    override val nome: String,
    override val celular: String,
    override val telefone: String,
    override val email: String
) : Contato {
}