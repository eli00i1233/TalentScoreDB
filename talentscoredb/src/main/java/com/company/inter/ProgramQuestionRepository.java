package com.company.inter;

import com.company.entity.ProgramQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramQuestionRepository extends JpaRepository<ProgramQuestion, Integer> {
}
