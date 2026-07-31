package com.ikiugu.springboot_railway_demo.note

data class CreateNoteRequest(
    val title: String,
    val content: String? = null,
)
