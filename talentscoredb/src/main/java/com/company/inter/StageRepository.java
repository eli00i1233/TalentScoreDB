package com.company.inter;

import com.company.entity.Stage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StageRepository extends JpaRepository<Stage,Integer> {
}
