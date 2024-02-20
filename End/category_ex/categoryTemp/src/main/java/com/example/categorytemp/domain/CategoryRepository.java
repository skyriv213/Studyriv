package com.example.categorytemp.domain;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    List<Category> findByParentId(Long parentId);

    Optional<Category> findByCode(String code);
}
