package io.devmike01.domain.usecases

import io.devmike01.domain.models.ShareDetailsModel
import kotlinx.coroutines.flow.Flow

interface SingleUserCase<R> {
    fun execute(): Flow<ShareDetailsModel>
}