package com.pagination.repositories;

import com.pagination.models.Contributor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContributorRepository extends CrudRepository<Contributor, Long> {
}
