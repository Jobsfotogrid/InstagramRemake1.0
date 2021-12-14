package br.com.instagram.profile.data

import br.com.instagram.common.base.RequestCallback
import br.com.instagram.common.model.Post
import br.com.instagram.common.model.UserAuth


class ProfileRepository(private val dataSource: ProfileDataSource) {

    fun fetchUserProfile(userUUID: String, callback: RequestCallback<UserAuth>) {
        dataSource.fetchUserProfile(userUUID, callback)
    }

    fun fetchUserPosts(userUUID: String, callback: RequestCallback<List<Post>>) {
        dataSource.fetchUserPosts(userUUID, callback)
    }

}