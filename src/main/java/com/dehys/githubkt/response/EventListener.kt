package com.dehys.githubkt.response

@Suppress("unused")
abstract class EventListener {

    abstract fun onSuccess(response: Any)
    abstract fun onError(error: String)

}