package com.dehys.githubkt.webhook.events

import com.dehys.githubkt.Github
import org.jetbrains.annotations.NotNull

class GenericEvent {
    @NotNull
    fun github() = Github
}