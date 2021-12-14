package br.com.instagram.common.base

import android.os.Handler
import android.os.Looper
import br.com.instagram.common.model.Database
import br.com.instagram.common.model.Post
import br.com.instagram.common.model.UserAuth
import br.com.instagram.profile.data.ProfileDataSource

class ProfileFakeRemoteDataSource : ProfileDataSource {

    override fun fetchUserProfile(userUUID: String, callback: RequestCallback<UserAuth>) {
        Handler(Looper.getMainLooper()).postDelayed({

            val userAuth = Database.usersAuth.firstOrNull { userUUID == it.uuid }

            if (userAuth != null) {
                callback.onSuccess(userAuth)
            } else {
                callback.onFailure("Usuário não encontrado")
            }

            callback.onComplete()
        }, 2000)
    }

    override fun fetchUserPosts(userUUID: String, callback: RequestCallback<List<Post>>) {
        Handler(Looper.getMainLooper()).postDelayed({

            val posts = Database.posts[userUUID]

            callback.onSuccess(posts?.toList() ?: emptyList())

            callback.onComplete()
        }, 2000)
    }

}