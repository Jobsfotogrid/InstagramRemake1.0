package br.com.instagram.add.data

import br.com.instagram.common.model.Database
import br.com.instagram.common.model.UserAuth

class AddLocalDataSource : AddDataSource {

    override fun fetchSession(): UserAuth {
        return Database.sessionAuth ?: throw RuntimeException("Usuário não logado!!")
    }

}