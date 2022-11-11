package com.example.kotlin.model

import lombok.Getter
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class CommonTest {
    @CreatedDate
    @Column(nullable = false, updatable = false)
    var createDtm: LocalDateTime ?= null

    @LastModifiedDate
    @Column(nullable = false)
    var modifyDtm: LocalDateTime ?= null
}