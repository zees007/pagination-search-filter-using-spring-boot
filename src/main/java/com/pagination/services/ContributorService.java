package com.pagination.services;

import com.pagination.models.Contributor;

import java.util.List;
import java.util.Optional;

/**
 * Author: Zeeshan Adil
 * User:mhmdz
 * Date:23-03-2024
 * Time:00:21
 */

public interface ContributorService {

    Long createContributor(Contributor contributor);

    List<Contributor> getAllContributors();

    Optional<Contributor> getContributorById(Long id);
}