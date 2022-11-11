package com.example.kotlin.repository

import com.example.kotlin.model.TestEntity
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.TestConstructor

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
class TestRepositoryTestEntity (val testRepository: TestRepository){

    @Test
    fun test() {
        val testEntity = TestEntity(text = "asd", context = "asd", etc = "asd")
        testRepository.save(testEntity)
        assertEquals(1L, testEntity.id)

        testRepository.save(TestEntity(text = "asdasd", context = "asd", etc = "asd"))

        val findAll = testRepository.findAll()

        for (testEntity in findAll) {
            println("testEntity.id = ${testEntity.id}")
            println("testEntity.text = ${testEntity.text}")
            println("testEntity.createdDateTime = ${testEntity.createDtm}")
        }
    }

}