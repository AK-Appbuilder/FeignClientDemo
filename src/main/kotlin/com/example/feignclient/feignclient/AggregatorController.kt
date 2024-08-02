package com.example.feignclient.feignclient

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class AggregatorController {

    @Autowired
    lateinit var bookClient: BookClient


    @GetMapping("/allbooks")
    fun getAllBooks(): List<Book> {
        return bookClient.getBooks()
    }
}