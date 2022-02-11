package com.dehys.githubkt.webhook

@Suppress("unused")
abstract class EventListener {

    abstract fun onSuccess(response: Any)
    abstract fun onError(error: String)

}