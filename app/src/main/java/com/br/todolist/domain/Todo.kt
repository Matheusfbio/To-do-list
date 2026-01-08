package com.br.todolist.domain

data class Todo(
    val id: Long,
    val title: String,
    val description: String?,
    val isDone: Boolean
)

// fake objects
val todo1 = Todo(1, "Todo 1", "Description for todo 1", false)
val todo2 = Todo(2, "Todo 2", "Description for todo 2", true)
val todo3 = Todo(3, "Todo 3", "Description for todo 3", false)
