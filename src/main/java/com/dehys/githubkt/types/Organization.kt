package com.dehys.githubkt.types

import com.dehys.githubkt.Github
import com.dehys.githubkt.types.repository.Repository
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

@Suppress("unused")
data class Organization (
    val login: String,
    val id: Long,

    @SerializedName("node_id")
    val nodeID: String,

    val url: String,

    @SerializedName("repos_url")
    val reposURL: String,

    @SerializedName("events_url")
    val eventsURL: String,

    @SerializedName("hooks_url")
    val hooksURL: String,

    @SerializedName("issues_url")
    val issuesURL: String,

    @SerializedName("members_url")
    val membersURL: String,

    @SerializedName("public_members_url")
    val publicMembersURL: String,

    @SerializedName("avatar_url")
    val avatarURL: String,

    val description: String,
    val name: String,
    val company: Any? = null,
    val blog: String,
    val location: Any? = null,
    val email: Any? = null,

    @SerializedName("twitter_username")
    val twitterUsername: Any? = null,

    @SerializedName("is_verified")
    val isVerified: Boolean,

    @SerializedName("has_organization_projects")
    val hasOrganizationProjects: Boolean,

    @SerializedName("has_repository_projects")
    val hasRepositoryProjects: Boolean,

    @SerializedName("public_repos")
    val publicRepos: Long,

    @SerializedName("public_gists")
    val publicGists: Long,

    val followers: Long,
    val following: Long,

    @SerializedName("html_url")
    val htmlURL: String,

    @SerializedName("created_at")
    val createdAt: String,

    @SerializedName("updated_at")
    val updatedAt: String,

    val type: String
) {

    override fun toString(): String {
        return Gson().toJson(this)
    }

    fun getRepos(): List<Repository> {
        return Github.getRepos(this.login)
    }

}