package com.example.feignclient.feignclient

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping


@FeignClient(value = "books-service", url = "\${services.endpoints.books-search}")
interface BookClient {

    @GetMapping("/findall")
    fun getBooks(): List<Book>
}