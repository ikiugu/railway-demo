package com.ikiugu.springboot_railway_demo.note

import org.springframework.stereotype.Service


@Service
class NoteService(private val noteRepository: NoteRepository) {
    fun create(request: CreateNoteRequest): Note {
        val note = Note(
            title = request.title,
            content = request.content,
        )

        return noteRepository.save(note)
    }

    fun findAll(): List<Note> = noteRepository.findAll()
}