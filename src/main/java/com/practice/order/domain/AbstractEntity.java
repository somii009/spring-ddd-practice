package com.practice.order.domain;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.ZonedDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity {

    // @CreatedDate -> ZonedDateTime을 지원하지 않음
    @CreationTimestamp
    private ZonedDateTime createdAt;

    // @LastModifiedDate
    @UpdateTimestamp
    private ZonedDateTime updatedAt;
}
