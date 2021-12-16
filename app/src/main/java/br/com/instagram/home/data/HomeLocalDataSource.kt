package br.com.instagram.home.data

import br.com.instagram.common.base.Cache
import br.com.instagram.common.base.RequestCallback
import br.com.instagram.common.model.Database
import br.com.instagram.common.model.Post
import br.com.instagram.common.model.UserAuth

class HomeLocalDataSource(private val feedCache: Cache<List<Post>>) : HomeDataSource {

    override fun fetchFeed(userUUID: String, callback: RequestCallback<List<Post>>) {
        val posts = feedCache.get(userUUID)
        if (posts != null) {
            callback.onSuccess(posts)
        } else {
            callback.onFailure("posts não existem")
        }
        callback.onComplete()
    }

    override fun fetchSession(): UserAuth {
        return Database.sessionAuth ?: throw RuntimeException("usuário não logado!!!")
    }

    override fun putFeed(response: List<Post>?) {
        feedCache.put(response)
    }

}