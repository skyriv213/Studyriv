package com.example.categorytemp.domain;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public List<Category> findByParentId(Long parentId) {
        return categoryRepository.findByParentId(parentId);
    }

    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    public Category findByCode(String code) {
        return categoryRepository.findByCode(code).orElse(null);
    }

    public Category findById(Long id) {
        return categoryRepository.findById(id).orElseThrow(()->new IllegalArgumentException("잘못된 접근입니다"));
    }
}
