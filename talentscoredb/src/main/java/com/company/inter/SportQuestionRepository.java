package com.company.inter;

import com.company.entity.SportQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportQuestionRepository extends JpaRepository<SportQuestion, Integer> {
}
