package com.quark

import java.time.LocalDate

interface DayCounter {
    fun days(startDate:LocalDate, endDate:LocalDate): Long
    fun yearFraction(startDate:LocalDate, endDate:LocalDate): Double
}