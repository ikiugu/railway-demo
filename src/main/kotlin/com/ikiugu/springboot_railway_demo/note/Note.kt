package com.ikiugu.springboot_railway_demo.note

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.OffsetDateTime

@Entity
@Table(name = "notes")
class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(nullable = false, length = 150)
    var title: String = ""

    @Column(columnDefinition = "TEXT")
    var content: String? = null

    @Column(name = "created_at", nullable = false)
    var createdAt: OffsetDateTime? = OffsetDateTime.now()
}