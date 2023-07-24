package com.company.inter;

import com.company.entity.ForeignLanguageUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForeignLanguageUserRepository extends JpaRepository<ForeignLanguageUser, Integer> {
}
