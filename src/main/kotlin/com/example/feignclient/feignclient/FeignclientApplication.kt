package com.example.feignclient.feignclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class FeignclientApplication

fun main(args: Array<String>) {
	runApplication<FeignclientApplication>(*args)
}
