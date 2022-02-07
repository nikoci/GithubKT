package com.dehys.githubkt

import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.MediaType.Companion.toMediaTypeOrNull
import okhttp3.RequestBody.Companion.toRequestBody

@Suppress("unused")
class HttpClient {

    private val client = OkHttpClient()
    private val mediaType: MediaType? = "application/json; charset=utf-8".toMediaTypeOrNull()

    fun get(route: String): String? {
        val request = Request.Builder().apply {
            url(if (route.startsWith("http")) route else if (route.startsWith("/")) Github.BASE_URL+route else Github.BASE_URL+"/$route")
            if (Github.privateAccessToken != null) {
                header("Authorization", "token ${Github.privateAccessToken}")
            }
        }.build()

        client.newCall(request).execute().use { response ->
            return if (response.body != null) response.body!!.string() else null
        }
    }

    fun post(url: String, json: String): String? {
        val body = json.toRequestBody(mediaType)
        val request = Request.Builder()
            .url(url)
            .post(body)
            .build()
        client.newCall(request).execute().use { response ->
            return if (response.body != null) response.body!!.string() else null
        }
    }
}