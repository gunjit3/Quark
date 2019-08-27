package com.quark.daycounters

import com.quark.DayCounter
import java.time.LocalDate
import java.time.temporal.ChronoUnit
import java.time.temporal.ChronoUnit.DAYS
import java.util.*

object Actual365 : DayCounter {
    val daysInYear = 365

    override fun days(startDate: LocalDate, endDate: LocalDate): Long {
        return ChronoUnit.DAYS.between(startDate, endDate)
    }

    override fun yearFraction(startDate: LocalDate, endDate: LocalDate): Double {
        return days(startDate, endDate).toDouble() / daysInYear
    }

}