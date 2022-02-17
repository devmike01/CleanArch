package io.devmike01.domain.usecases

import io.devmike01.domain.models.ShareDetailsModel
import io.devmike01.domain.repositories.AppRepository
import kotlinx.coroutines.flow.Flow

class GetShareDetailsUseCase(private val appRepository: AppRepository) : SingleUserCase<ShareDetailsModel>{

    override fun execute(): Flow<ShareDetailsModel> {
        return appRepository.getShareDetails()
    }
}