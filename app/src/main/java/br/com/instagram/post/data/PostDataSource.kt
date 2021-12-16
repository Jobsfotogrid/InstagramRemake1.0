package br.com.instagram.post.data

import android.net.Uri

interface PostDataSource {

    suspend fun fetchPictures(): List<Uri>

}