package com.example.basemvvm.utils

import java.text.SimpleDateFormat

import java.util.*

class DateUtils {

    companion object {
        const val FORMAT_DATE_TIME = "yyyy-MM-dd HH:mm:ss"
        const val FORMAT_DATE = "yyyy-MM-dd"
    }

    /**
     * convert time(with pattern) to milliseconds
     */
    fun timeToMilliseconds(time: String, pattern: String) : Long {
        val date = SimpleDateFormat(pattern, Locale.getDefault()).parse(time)
        return date?.time ?: 0L
    }

}