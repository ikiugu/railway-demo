package com.ikiugu.springboot_railway_demo.note

import org.springframework.data.jpa.repository.JpaRepository

interface NoteRepository : JpaRepository<Note, Long>