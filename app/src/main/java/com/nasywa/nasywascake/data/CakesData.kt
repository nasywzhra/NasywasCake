package com.nasywa.nasywascake.data
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
class CakesData (
    var cakeName: String = "",
    var location: String = "",
    var price: String = "",
    var detail: String = "",
    var photo: Int = 0,
): Parcelable