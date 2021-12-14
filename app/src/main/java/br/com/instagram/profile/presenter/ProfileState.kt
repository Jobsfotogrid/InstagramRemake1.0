package br.com.instagram.profile.presenter

import br.com.instagram.common.model.Post
import br.com.instagram.common.model.UserAuth
import br.com.instagram.profile.Profile

class ProfileState(
    private val posts: List<Post>?,
    private val userAuth: UserAuth?
) : Profile.State {

    override fun fetchUserProfile(): UserAuth? {
        return userAuth
    }

    override fun fetchUserPosts(): List<Post>? {
        return posts
    }
}