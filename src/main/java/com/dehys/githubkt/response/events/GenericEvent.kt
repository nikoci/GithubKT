package com.dehys.githubkt.response.events

import com.dehys.githubkt.Github
import org.jetbrains.annotations.NotNull

class GenericEvent {
    @NotNull
    fun github() = Github
}