package com.company.inter;

import com.company.entity.OlympiadUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OlympiadUserRepository extends JpaRepository<OlympiadUser, Integer> {
}
