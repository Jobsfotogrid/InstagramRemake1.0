package br.com.instagram.register.data

interface RegisterCallback {

    fun onSuccess()
    fun onFailure(message: String)
    fun onComplete()

}