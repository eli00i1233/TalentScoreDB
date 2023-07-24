package com.company.inter;

import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByEmailAndPassword(String email, String password);
}
