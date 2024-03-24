package com.pagination.repositories;

import com.pagination.models.Project;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    @Query("SELECT DISTINCT p FROM Project p LEFT JOIN p.contributors c WHERE " +
            ":lookupText IS NULL " +
            "OR p.projectName LIKE :lookupText " +
            "OR p.description LIKE :lookupText " +
            "OR c.name LIKE :lookupText " +
            "OR c.mobile LIKE :lookupText " +
            "OR c.email LIKE :lookupText " +
            "AND ((:startDate IS NULL AND :endDate IS NULL) OR " +
            "(p.startDate <= :endDate AND p.endDate >= :startDate))")
    Page<Project> search(String lookupText, Date startDate, Date endDate, Pageable pageable);
}
