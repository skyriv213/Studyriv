package com.example.oauth2.domain.repository;

import com.example.oauth2.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

//    Optional<User> findByEmail(String email);
    Optional<User> findByOauth2Id(String oauth2Id);
}
