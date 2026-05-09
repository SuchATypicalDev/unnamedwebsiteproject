package com.elhackarz.fehu2026.repositories;

import com.elhackarz.fehu2026.models.Assignments;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AssignmentsRepo extends JpaRepository<Assignments, Long>  {
    List<Assignments> findBySubjectId(Long subjectId);
}
