package com.pagination.services;

import com.pagination.models.Project;

import java.util.List;
import java.util.Optional;

/**
 * Author: Zeeshan Adil
 * User:mhmdz
 * Date:23-03-2024
 * Time:00:20
 */

public interface ProjectService {

    Long createProject(Project project);

    List<Project> getAllProjects();

    Optional<Project> getProjectById(Long id);
}
