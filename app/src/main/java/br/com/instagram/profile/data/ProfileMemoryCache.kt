package br.com.instagram.profile.data

import br.com.instagram.common.base.Cache
import br.com.instagram.common.model.UserAuth

object ProfileMemoryCache : Cache<UserAuth> {

    private var userAuth: UserAuth? = null

    override fun isCached(): Boolean {
        return userAuth != null
    }

    override fun get(key: String): UserAuth? {
        if (userAuth?.uuid == key) {
            return userAuth
        }
        return null
    }

    override fun put(data: UserAuth?) {
        userAuth = data
    }

}