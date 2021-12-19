package br.com.instagram.search.data

import br.com.instagram.common.base.RequestCallback
import br.com.instagram.common.model.User

interface SearchDataSource {

    fun fetchUsers(name: String, callback: RequestCallback<List<User>>)

}