package com.dehys.githubkt.webhook.events

import com.dehys.githubkt.types.repository.Repository
import com.google.gson.annotations.SerializedName

data class PushEvent (
    val ref: String,
    val before: String,
    val after: String,
    val repository: Repository,
    val pusher: PLPusher,
    val sender: PLSender,
    val created: Boolean,
    val deleted: Boolean,
    val forced: Boolean,

    @SerializedName("base_ref")
    val baseRef: Any? = null,

    val compare: String,
    val commits: List<PLCommit>,

    @SerializedName("head_commit")
    val headCommit: PLCommit
) {


    data class PLCommit (
        val id: String,

        @SerializedName("tree_id")
        val treeID: String,

        val distinct: Boolean,
        val message: String,
        val timestamp: String,
        val url: String,
        val author: PLCommitAuthor,
        val committer: PLCommitAuthor,
        val added: List<Any?>,
        val removed: List<Any?>,
        val modified: List<String>
    )

    data class PLCommitAuthor (
        val name: String,
        val email: String,
        val username: String
    )

    data class PLPusher (
        val name: String,
        val email: String
    )

    data class PLSender (
        val name: String? = null,
        val email: String? = null,
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
        val siteAdmin: Boolean
    )
}