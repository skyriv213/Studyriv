package com.study.stackintelli.domain.posts;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;


    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }

    @Test
    void save() {
        String title = "Title1";
        String content = "content1";
        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("ipipip@naver.com")
                .build());
    }
    @Test
    void findAll(){
        List<Posts> postsList = postsRepository.findAll();
        for (Posts post : postsList) {
            System.out.println(post);

        }
    }
    @Test
    void find(){
        List<Posts> postsList = postsRepository.findAll();
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo("Title1");
        assertThat(posts.getContent()).isEqualTo("content1");
    }

    @Test
    void BaseTimeEntity(){
        //given
        LocalDateTime now = LocalDateTime.of(2019, 6, 4, 0, 0, 0);
        postsRepository.save(Posts.builder()
                .title("title_modi")
                .content("modi_content")
                .author("modi_author")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);

        System.out.println("createdDate = " + posts.getCreatedDate()
                + ", modifiedDate = " + posts.getModifiedDate());

        assertThat(posts.getCreatedDate()).isAfter(now);
        assertThat(posts.getModifiedDate()).isAfter(now);

    }
}
