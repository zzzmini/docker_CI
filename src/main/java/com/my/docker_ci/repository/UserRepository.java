package com.my.docker_ci.repository;

import com.my.docker_ci.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
