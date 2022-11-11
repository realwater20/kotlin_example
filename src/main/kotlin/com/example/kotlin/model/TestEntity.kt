package com.example.kotlin.model

import lombok.Builder
import lombok.Getter
import java.util.UUID
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Getter
@Entity
class TestEntity(text : String, context: String) : CommonTest() {
        @Id
        @GeneratedValue
        var id : Long? = null
        var text : String = text
        var context: String = context

        fun updateTest(text: String) {
                this.text = text
        }
}
