package com.dehys.githubkt.response

import com.dehys.githubkt.response.types.Payload
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import fi.iki.elonen.NanoHTTPD


@Suppress("unused")
class ResponseServer : NanoHTTPD {

    constructor(host: String?, port: Int) : super(host, port)
    constructor(port: Int) : super(port)

    val payloads: MutableList<Payload> = mutableListOf()

    override fun start() {
        start(SOCKET_READ_TIMEOUT, false)
        println(
            """
                
                [ResponseServer] Running on http://${if (super.getHostname() == null) "localhost" else super.getHostname()}:${super.getListeningPort()}
                
                """.trimIndent()
        )
    }

    override fun serve(session: IHTTPSession): Response {
        val headers: MutableMap<String, String> = session.headers
        val uri: String = session.uri

        if (Method.POST == session.method && "/github" == uri) {
            val files: Map<String, String> = HashMap()
            session.parseBody(files)
            payloads.add(Gson().fromJson(files["postData"].toString(), Payload::class.java))

            //print everything to console
            println("\n\n")
            println("URI: $uri")
            println("Headers: ${headers.toString().replace(",", "\n").replace("{", "{\n").replace("}", "\n}")}")
            println("Body: ${files["postData"]}")
            println("\n\n")
        }

        val result = GsonBuilder().create().toJsonTree(payloads)

        return newFixedLengthResponse(
            Response.Status.OK,
            "application/json",
            result.toString()
        )
    }
}