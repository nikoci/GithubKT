package com.dehys.githubkt.types

import com.dehys.githubkt.Github
import com.dehys.githubkt.types.repository.Repository
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

@Suppress("unused")
data class User (
    val login: String,
    val id: Long,

    @SerializedName("node_id")
    val nodeID: String,

    @SerializedName("avatar_url")
    val avatarURL: String,

    @SerializedName("gravatar_id")
    val gravatarID: String,

    val url: String,

    @SerializedName("html_url")
    val htmlURL: String,

    @SerializedName("followers_url")
    val followersURL: String,

    @SerializedName("following_url")
    val followingURL: String,

    @SerializedName("gists_url")
    val gistsURL: String,

    @SerializedName("starred_url")
    val starredURL: String,

    @SerializedName("subscriptions_url")
    val subscriptionsURL: String,

    @SerializedName("organizations_url")
    val organizationsURL: String,

    @SerializedName("repos_url")
    val reposURL: String,

    @SerializedName("events_url")
    val eventsURL: String,

    @SerializedName("received_events_url")
    val receivedEventsURL: String,

    val type: String,

    @SerializedName("site_admin")
    val siteAdmin: Boolean,

    val name: String,
    val company: String,
    val blog: String,
    val location: String,
    val email: String,
    val hireable: Boolean,
    val bio: String,

    @SerializedName("twitter_username")
    val twitterUsername: String,

    @SerializedName("public_repos")
    val publicRepos: Long,

    @SerializedName("public_gists")
    val publicGists: Long,

    val followers: Long,
    val following: Long,

    @SerializedName("created_at")
    val createdAt: String,

    @SerializedName("updated_at")
    val updatedAt: String
) {

    override fun toString(): String {
        return Gson().toJson(this)
    }

    fun getRepos(): List<Repository> {
        return Github.getRepos(this.login)
    }

}