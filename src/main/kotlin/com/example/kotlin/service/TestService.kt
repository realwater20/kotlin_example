package com.example.kotlin.service

import com.example.kotlin.model.TestEntity
import com.example.kotlin.repository.TestRepository
import org.springframework.stereotype.Service

@Service
class TestService (
        private val testRepository: TestRepository
        ) {

   fun test(): List<TestEntity> {
       val findAll = testRepository.findAll();
       return findAll
   }

}