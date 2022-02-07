package com.dehys.githubkt

import com.dehys.githubkt.types.Organization
import com.dehys.githubkt.types.User
import com.dehys.githubkt.types.repository.Repository
import com.google.gson.Gson

@Suppress("unused")
object Github {

    const val BASE_URL = "https://api.github.com"
    var privateAccessToken: String? = null

    private var httpClient: HttpClient = HttpClient()

    // route: /users

    fun getUser(login: String): User? {
        return Gson().fromJson(httpClient.get("users/$login"), User::class.java) ?: null
    }

    fun getRepos(login: String): List<Repository> {
        return Gson().fromJson(httpClient.get("users/$login/repos"), Array<Repository>::class.java).toList()
    }

    // route: /repos

    fun getRepo(owner: String, repo: String): Repository? {
        return Gson().fromJson(httpClient.get("repos/$owner/$repo"), Repository::class.java) ?: null
    }

    //route: /orgs

    fun getOrg(login: String): Organization? {
        return Gson().fromJson(httpClient.get("orgs/$login"), Organization::class.java) ?: null
    }
}