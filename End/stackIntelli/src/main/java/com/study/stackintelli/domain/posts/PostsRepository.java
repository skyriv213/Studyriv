package com.study.stackintelli.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/***
 * DB Layer
 * Jpa에서는 repository라고 불리우며 인터페이스로 생성이 된다.
 * 인터페이스를 생성 후 , JpaRepository<Posts, Long> 이런 식으로
 * <Entity 클래스, PK 타입>를 상속 시 기본적으로 CRUD 메서드가 생성이 된다.
 * 주의할 점 : Entity 클래스와 기본 Entity Repository는 함께 위치해야함
 * 따라서 도메인 패키지에서 함께 관리해야한다
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();
}
