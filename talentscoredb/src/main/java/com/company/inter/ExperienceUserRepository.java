package com.company.inter;

import com.company.entity.ExperienceUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceUserRepository extends JpaRepository<ExperienceUser, Integer> {
}
