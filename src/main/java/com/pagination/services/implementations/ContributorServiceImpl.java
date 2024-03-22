package com.pagination.services.implementations;

import com.pagination.models.Contributor;
import com.pagination.repositories.ContributorRepository;
import com.pagination.services.ContributorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Author: Zeeshan Adil
 * User:mhmdz
 * Date:23-03-2024
 * Time:00:21
 */

@Service
public class ContributorServiceImpl implements ContributorService {

    @Autowired
    ContributorRepository contributorRepository;

    @Override
    public Long createContributor(Contributor contributor) {
        return contributorRepository.save(contributor).getId();
    }

    @Override
    public List<Contributor> getAllContributors() {
        return (List<Contributor>) contributorRepository.findAll();
    }

    @Override
    public Optional<Contributor> getContributorById(Long id) {
        return contributorRepository.findById(id);
    }
}