package com.dehys.githubkt.webhook.types

import com.dehys.githubkt.types.repository.Repository
import com.google.gson.annotations.SerializedName

data class Payload (
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
)