package com.company.inter;

import com.company.entity.OlympiadQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OlympiadQuestionRepository extends JpaRepository<OlympiadQuestion, Integer> {
}
