package com.example.kotlin.repository

import com.example.kotlin.model.TestEntity
import org.springframework.data.jpa.repository.JpaRepository

interface TestRepository : JpaRepository<TestEntity, Long> {
}