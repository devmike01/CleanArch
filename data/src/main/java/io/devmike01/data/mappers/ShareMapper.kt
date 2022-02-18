package io.devmike01.data.mappers

import io.devmike01.data.ShareDataModel
import javax.inject.Inject

class ShareMapper @Inject constructor(){

    fun toShareDetails(shareDataModelServer: ShareDataModel): ShareDataModel{
        return ShareDataModel(
            //shareDataModelServer.shareMessage =""
        )
    }

}