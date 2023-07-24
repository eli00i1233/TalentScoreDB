package com.company.inter;

import com.company.entity.EducationUser;
import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationUserRepository extends JpaRepository<EducationUser, Integer> {
}
