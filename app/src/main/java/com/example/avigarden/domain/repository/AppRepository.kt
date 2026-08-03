package com.example.avigarden.domain.repository

import com.example.avigarden.data.database.AppLogEntity
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    fun getLogs(): Flow<List<AppLogEntity>>
    suspend fun addLog(title: String, content: String)
}
