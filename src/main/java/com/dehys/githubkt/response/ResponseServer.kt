package com.dehys.githubkt.response

import com.dehys.githubkt.Github
import fi.iki.elonen.NanoHTTPD

@Suppress("unused")
class ResponseServer : NanoHTTPD {

    constructor(host: String?, port: Int) : super(host, port)
    constructor(port: Int) : super(port)
    init {
        if (Github.privateAccessToken == null) throw IllegalStateException("Github.privateAccessToken is not initialized")
        //init http servlet to listen for http requests from github webhooks
    }


    
    // Able to connect webhooks to the api by addEventListener

}