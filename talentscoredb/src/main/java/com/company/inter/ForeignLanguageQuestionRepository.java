package com.company.inter;

import com.company.entity.ForeignLanguageQuestion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ForeignLanguageQuestionRepository extends JpaRepository<ForeignLanguageQuestion, Integer> {
}
