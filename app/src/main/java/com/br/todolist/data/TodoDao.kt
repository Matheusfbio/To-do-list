package com.br.todolist.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface TodoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(todo: TodoEntity)

    @Delete
    suspend fun delete(todo: TodoEntity)

    @Query("SELECT * FROM todos")
    fun getAll(): Flow<List<TodoEntity>>

    @Query("SELECT * FROM todos WHERE id = :id")
    suspend fun getById(id: Long): TodoEntity?

    @Update
    suspend fun update(todo: TodoEntity)

//    // Adicionando a função de atualização de status, se ainda não estiver definida
//    @Query("UPDATE todos SET isCompleted = :isCompleted WHERE id = :id")
//    suspend fun updateCompleted(id: Long, isCompleted: Boolean)
}