package com.dehys.githubkt.webhook

import com.dehys.githubkt.webhook.types.Payload
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import fi.iki.elonen.NanoHTTPD


@Suppress("unused")
object WebhookAPI : NanoHTTPD("0.0.0.0", 24249) {

    val payloads: MutableList<Payload> = mutableListOf()

    override fun start() {
        start(SOCKET_READ_TIMEOUT, false)
        println(
            """
                
                [GithubKT] WebhookAPI Running on http://${if (super.getHostname() == null) "localhost" else super.getHostname()}:${super.getListeningPort()}
                
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

    private fun addPayload(payload: Payload) {
        payloads.add(payload)
    }
}