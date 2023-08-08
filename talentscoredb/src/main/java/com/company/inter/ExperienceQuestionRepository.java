package com.company.inter;

import com.company.entity.ExperienceQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceQuestionRepository extends JpaRepository<ExperienceQuestion, Integer> {
}
