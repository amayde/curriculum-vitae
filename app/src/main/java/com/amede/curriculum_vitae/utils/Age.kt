package com.amede.curriculum_vitae.utils

import java.time.LocalDate
import java.time.Period

fun getAge(): Int {
    return Period.between(
        LocalDate.of(1995, 11, 20),
        LocalDate.now()
    ).years
}