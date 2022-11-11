package com.example.kotlin.service

import com.example.kotlin.model.TestEntity
import com.example.kotlin.repository.TestRepository
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class TestServiceTest (val testRepository: TestRepository, val testService: TestService){

    @Test
    fun test() {
        val testEntity = TestEntity(text = "asd")
        testRepository.save(testEntity)
        assertEquals(1L, testEntity.id)

        testRepository.save(TestEntity(text = "asdasd"))

        val test = testService.test()
        for (testEntity in test) {
            println("testEntity.text = ${testEntity.text}")
        }
    }
}