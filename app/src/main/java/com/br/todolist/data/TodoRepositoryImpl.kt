package com.br.todolist.data

import com.br.todolist.domain.Todo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import kotlin.text.insert

class TodoRepositoryImpl(
    private val dao: TodoDao
) : TodoRepository {
    override suspend fun insert(title: String, description: String?, id: Long?) {
        val entity = id?.let {
            dao.getById(it)?.copy(
                title = title,
                description = description,
            )
        } ?: TodoEntity(
            title = title,
            description = description,
            isDone = false,
        )

        dao.insert(entity)
    }


    override suspend fun updateCompleted(id: Long, isCompleted: Boolean) {
        val existingEntity = dao.getById(id) ?: return
        val updatedEntity = existingEntity.copy(isDone = isCompleted)
        dao.insert(updatedEntity)
    }

    override suspend fun delete(id: Long) {
        val existingEntity = dao.getById(id) ?: return
        dao.delete(existingEntity)
    }

    override fun getAll(): Flow<List<Todo>> {
        return dao.getAll().map { entities ->
            entities.map { entity ->
                Todo(
                    id = entity.id,
                    title = entity.title,
                    description = entity.description,
                    isDone = entity.isDone,
                )
            }
        }
    }

    override suspend fun getById(id: Long): Todo? {
        return dao.getById(id)?.let { entity ->
            Todo(
                id = entity.id,
                title = entity.title,
                description = entity.description,
                isDone = entity.isDone,
            )
        }
    }

}