package com.example.iqbaalrafi

import com.example.iqbaalrafi.data.local.AppDatabase
import com.example.iqbaalrafi.data.local.LocalRepository
import com.example.iqbaalrafi.data.local.UserEntity
import com.example.iqbaalrafi.data.remote.RemoteRepository

class AppRepository(private val localRepository: LocalRepository, private val remoteRepository: RemoteRepository) {
    suspend fun insertUser(user:UserEntity){
        localRepository.insertUser(user)
    }
    suspend fun getUser(email: String, password: String): UserEntity{
        return localRepository.getUser(email, password)
    }
}