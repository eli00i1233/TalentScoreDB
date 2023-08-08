package com.company.inter;

import com.company.entity.ProgramUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramUserRepository extends JpaRepository<ProgramUser, Integer> {
}
