package com.lim.todolist.repository

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import org.hibernate.annotations.ColumnDefault

@Entity
class Todo (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    @ColumnDefault("false")
    var completed: Boolean = false,

    @Column(nullable = false)
    var todoName: String
)