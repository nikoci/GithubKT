package com.dehys.githubkt.response

import com.dehys.githubkt.Github

@Suppress("unused")
object ResponseAPI {

    init {
        if (Github.privateAccessToken == null) throw IllegalStateException("Github.privateAccessToken is not initialized")
        //init http servlet to listen for http requests from github webhooks
    }

    // Able to connect webhooks to the api by addEventListener

}