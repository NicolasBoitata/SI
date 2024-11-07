package com.test.sistemainformacao.database.repository

import android.content.Context
import com.test.sistemainformacao.database.dao.ContatoDb
import com.test.sistemainformacao.model.Contato

//import com.test.sistemainformacao.model.Contato

class ContatoRepository(context: Context) {

    private val db = ContatoDb.getDatabase(context).contatoDao()

    fun salvar(contato: Contato): Long {
        return db.salvar(contato)
    }

    fun atualizar(contato: Contato): Int {
        return db.atualizar(contato)
    }

    fun excluir(contato: Contato): Int {
        return db.excluir(contato)
    }

    fun listarContatos(): List<Contato> {
        return db.listarContatos()
    }

    fun buscarContatoPeloId(id: Int): Contato {
        return db.buscarContatoPeloId(id)
    }

}