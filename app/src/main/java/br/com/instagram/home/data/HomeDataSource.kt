package br.com.instagram.home.data

import br.com.instagram.common.base.RequestCallback
import br.com.instagram.common.model.Post

interface HomeDataSource {

    fun fetchFeed(userUUID: String, callback: RequestCallback<List<Post>>)

    fun fetchSession() : String { throw UnsupportedOperationException() }

    fun putFeed(response: List<Post>?) { throw UnsupportedOperationException() }

}