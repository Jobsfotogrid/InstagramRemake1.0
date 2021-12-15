package br.com.instagram.add.data

import android.net.Uri
import br.com.instagram.common.base.RequestCallback
import br.com.instagram.common.model.UserAuth

interface AddDataSource {

    fun createPost(userUUID: String, uri: Uri, caption: String, callback: RequestCallback<Boolean>) { throw UnsupportedOperationException() }

    fun fetchSession() : UserAuth { throw UnsupportedOperationException() }

}