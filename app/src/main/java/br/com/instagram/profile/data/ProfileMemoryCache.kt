package br.com.instagram.profile.data

import br.com.instagram.common.base.Cache
import br.com.instagram.common.model.User
import br.com.instagram.common.model.UserAuth

object ProfileMemoryCache : Cache<Pair<User, Boolean?>> {

    private var user: Pair<User, Boolean?>? = null

    override fun isCached(): Boolean {
        return user != null
    }

    override fun get(key: String): Pair<User, Boolean?>? {
        if (user?.first?.uuid == key) {
            return user
        }
        return null
    }

    override fun put(data: Pair<User, Boolean?>?) {
        user = data
    }

}