package br.com.instagram.common.model

import android.net.Uri
import java.io.File
import java.util.*

object Database {

    val usersAuth = mutableListOf<UserAuth>()
    val posts = hashMapOf<String, MutableSet<Post>>()
    val feeds = hashMapOf<String, MutableSet<Post>>()
    val followers = hashMapOf<String, Set<String>>()

    var sessionAuth: UserAuth? = null

    init {
        val userA = UserAuth(UUID.randomUUID().toString(), "UserA", "userA@gmail.com", "12345678", Uri.fromFile(
            File("/storage/emulated/0/Android/media/br.com.instagram/Instagram/2021-12-15-18-28-10-401.jpg")))

        val userB = UserAuth(UUID.randomUUID().toString(), "UserB", "userB@gmail.com", "87654321", Uri.fromFile(
            File("/storage/emulated/0/Android/media/br.com.instagram/Instagram/2021-12-15-19-35-15-232.jpg")))

        usersAuth.add(userA)
        usersAuth.add(userB)

        followers[userA.uuid] = hashSetOf()
        posts[userA.uuid] = hashSetOf()
        feeds[userA.uuid] = hashSetOf()

        followers[userB.uuid] = hashSetOf()
        posts[userB.uuid] = hashSetOf()
        feeds[userB.uuid] = hashSetOf()

        for(i in 0..30) {
            val user = UserAuth(UUID.randomUUID().toString(), "User$i", "user$i@gmail.com", "123123123", null)
            usersAuth.add(user)
        }

        sessionAuth = usersAuth.first()
    }

}