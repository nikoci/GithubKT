package com.dehys.githubkt.webhook.types

import com.google.gson.annotations.SerializedName

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