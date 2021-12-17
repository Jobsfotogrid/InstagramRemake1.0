package br.com.instagram.search.data

import br.com.instagram.common.base.RequestCallback
import br.com.instagram.common.model.UserAuth

interface SearchDataSource {

    fun fetchUsers(name: String, callback: RequestCallback<List<UserAuth>>)

}