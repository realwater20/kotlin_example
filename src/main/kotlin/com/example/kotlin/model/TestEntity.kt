package com.example.kotlin.model

import lombok.Builder
import lombok.Getter
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Getter
@Entity
class TestEntity(text : String) : CommonTest() {
        @Id
        @GeneratedValue
        var id : Long? = null
        var text : String = text

        fun updateTest(text: String) {
                this.text = text
        }
}
