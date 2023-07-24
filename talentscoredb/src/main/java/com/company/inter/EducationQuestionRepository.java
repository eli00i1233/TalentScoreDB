package com.company.inter;

import com.company.entity.EducationQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationQuestionRepository extends JpaRepository<EducationQuestion,Integer> {
}
