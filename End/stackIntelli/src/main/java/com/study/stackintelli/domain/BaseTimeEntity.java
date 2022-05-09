package com.study.stackintelli.domain;

/***
 *
 */

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // JPA Entity 클래스들이 BaseTimeEntity을 상속할 경우 필드들도 column으로 인식할 수 있게 해줌
@EntityListeners(AuditingEntityListener.class) // BaseTime 클래스에 Auditing기능 추가
public class BaseTimeEntity {

    @CreatedDate // entity 생성시 시간 자동 저장
    private LocalDateTime createdDate;

    @LastModifiedDate // 조회한 entity값 변경시 시간 자동 저장
    private LocalDateTime modifiedDate;
}
