package com.helloIftekhar.springJpaAuth.repository;

import com.helloIftekhar.springJpaAuth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String username);
}
