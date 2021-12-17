package br.com.instagram.search.data

import android.os.Handler
import android.os.Looper
import br.com.instagram.common.base.RequestCallback
import br.com.instagram.common.model.Database
import br.com.instagram.common.model.UserAuth

class SearchFakeRemoteDataSource : SearchDataSource {

    override fun fetchUsers(name: String, callback: RequestCallback<List<UserAuth>>) {
        Handler(Looper.getMainLooper()).postDelayed({
            val users = Database.usersAuth.filter {
                it.name.lowercase()
                    .startsWith(name.lowercase()) && it.uuid != Database.sessionAuth!!.uuid
            }

            callback.onSuccess(users.toList())

            callback.onComplete()

        }, 2000)
    }

}