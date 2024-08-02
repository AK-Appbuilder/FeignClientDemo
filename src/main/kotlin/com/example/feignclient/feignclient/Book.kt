package com.example.feignclient.feignclient

import java.math.BigDecimal
import java.time.LocalDate

class Book(
    val title: String,
    val price: BigDecimal,
    val publishDate: LocalDate,
    val id: Long?= null,
)