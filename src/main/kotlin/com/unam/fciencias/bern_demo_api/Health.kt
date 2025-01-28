package com.unam.fciencias.bern_demo_api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/bern-demo/health")
class Health {

    @GetMapping
    fun retrieveHealth(): ResponseEntity<String>{
        return ResponseEntity.ok("Everything is fine. HELLO WORLD")
    }
}