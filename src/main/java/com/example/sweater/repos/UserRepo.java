package com.example.sweater.repos;/*
 *
 * Author(s):
 * Dmitry Privalov
 *
 */

import com.example.sweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
