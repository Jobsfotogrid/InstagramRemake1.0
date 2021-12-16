package br.com.instagram.home.data

import br.com.instagram.common.base.RequestCallback
import br.com.instagram.common.model.Post
import br.com.instagram.common.model.UserAuth

interface HomeDataSource {

    fun fetchFeed(userUUID: String, callback: RequestCallback<List<Post>>)

    fun fetchSession() : UserAuth { throw UnsupportedOperationException() }

    fun putFeed(response: List<Post>?) { throw UnsupportedOperationException() }

}