package com.company.inter;

import com.company.entity.SportUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportUserRepository extends JpaRepository<SportUser, Integer> {
}
