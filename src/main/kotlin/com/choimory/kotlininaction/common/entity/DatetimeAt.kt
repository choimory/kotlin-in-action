package com.choimory.kotlininaction.common.entity

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class DatetimeAt {
    @CreatedDate
    protected var createdAt: LocalDateTime? = null

    @LastModifiedDate
    protected var updatedAt: LocalDateTime? = null

    protected var deletedAt: LocalDateTime? = null
}