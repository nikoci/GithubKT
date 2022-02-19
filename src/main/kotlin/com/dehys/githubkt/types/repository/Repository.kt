package com.dehys.githubkt.types.repository

import com.google.gson.annotations.SerializedName

data class Repository (
    val id: Long,

    @SerializedName("node_id")
    val nodeID: String,

    val name: String,

    @SerializedName("full_name")
    val fullName: String,

    val private: Boolean,
    val owner: Owner,

    @SerializedName("html_url")
    val htmlURL: String,

    val description: String,
    val fork: Boolean,
    val url: String,

    @SerializedName("forks_url")
    val forksURL: String,

    @SerializedName("keys_url")
    val keysURL: String,

    @SerializedName("collaborators_url")
    val collaboratorsURL: String,

    @SerializedName("teams_url")
    val teamsURL: String,

    @SerializedName("hooks_url")
    val hooksURL: String,

    @SerializedName("issue_events_url")
    val issueEventsURL: String,

    @SerializedName("events_url")
    val eventsURL: String,

    @SerializedName("assignees_url")
    val assigneesURL: String,

    @SerializedName("branches_url")
    val branchesURL: String,

    @SerializedName("tags_url")
    val tagsURL: String,

    @SerializedName("blobs_url")
    val blobsURL: String,

    @SerializedName("git_tags_url")
    val gitTagsURL: String,

    @SerializedName("git_refs_url")
    val gitRefsURL: String,

    @SerializedName("trees_url")
    val treesURL: String,

    @SerializedName("statuses_url")
    val statusesURL: String,

    @SerializedName("languages_url")
    val languagesURL: String,

    @SerializedName("stargazers_url")
    val stargazersURL: String,

    @SerializedName("contributors_url")
    val contributorsURL: String,

    @SerializedName("subscribers_url")
    val subscribersURL: String,

    @SerializedName("subscription_url")
    val subscriptionURL: String,

    @SerializedName("commits_url")
    val commitsURL: String,

    @SerializedName("git_commits_url")
    val gitCommitsURL: String,

    @SerializedName("comments_url")
    val commentsURL: String,

    @SerializedName("issue_comment_url")
    val issueCommentURL: String,

    @SerializedName("contents_url")
    val contentsURL: String,

    @SerializedName("compare_url")
    val compareURL: String,

    @SerializedName("merges_url")
    val mergesURL: String,

    @SerializedName("archive_url")
    val archiveURL: String,

    @SerializedName("downloads_url")
    val downloadsURL: String,

    @SerializedName("issues_url")
    val issuesURL: String,

    @SerializedName("pulls_url")
    val pullsURL: String,

    @SerializedName("milestones_url")
    val milestonesURL: String,

    @SerializedName("notifications_url")
    val notificationsURL: String,

    @SerializedName("labels_url")
    val labelsURL: String,

    @SerializedName("releases_url")
    val releasesURL: String,

    @SerializedName("deployments_url")
    val deploymentsURL: String,

    @SerializedName("created_at")
    val createdAt: String,

    @SerializedName("updated_at")
    val updatedAt: String,

    @SerializedName("pushed_at")
    val pushedAt: String,

    @SerializedName("git_url")
    val gitURL: String,

    @SerializedName("ssh_url")
    val sshURL: String,

    @SerializedName("clone_url")
    val cloneURL: String,

    @SerializedName("svn_url")
    val svnURL: String,

    val homepage: String,
    val size: Long,

    @SerializedName("stargazers_count")
    val stargazersCount: Long,

    @SerializedName("watchers_count")
    val watchersCount: Long,

    val language: String,

    @SerializedName("has_issues")
    val hasIssues: Boolean,

    @SerializedName("has_projects")
    val hasProjects: Boolean,

    @SerializedName("has_downloads")
    val hasDownloads: Boolean,

    @SerializedName("has_wiki")
    val hasWiki: Boolean,

    @SerializedName("has_pages")
    val hasPages: Boolean,

    @SerializedName("forks_count")
    val forksCount: Long,

    @SerializedName("mirror_url")
    val mirrorURL: String,

    val archived: Boolean,
    val disabled: Boolean,

    @SerializedName("open_issues_count")
    val openIssuesCount: Long,

    val license: License,

    @SerializedName("allow_forking")
    val allowForking: Boolean,

    @SerializedName("is_template")
    val isTemplate: Boolean,

    val topics: List<String>,
    val visibility: String,
    val forks: Long,

    @SerializedName("open_issues")
    val openIssues: Long,

    val watchers: Long,

    @SerializedName("default_branch")
    val defaultBranch: String
)