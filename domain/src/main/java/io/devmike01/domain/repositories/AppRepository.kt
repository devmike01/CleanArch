package io.devmike01.domain.repositories

import io.devmike01.domain.models.ShareDetailsModel
import kotlinx.coroutines.flow.Flow

interface AppRepository {
    fun getShareDetails(): Flow<ShareDetailsModel>
}