package com.pagination.services.implementations;

import com.pagination.dto.ProjectSearchAndFilterRequest;
import com.pagination.helpers.UtilService;
import com.pagination.models.Contributor;
import com.pagination.models.Project;
import com.pagination.repositories.ProjectRepository;
import com.pagination.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Author: Zeeshan Adil
 * User:mhmdz
 * Date:23-03-2024
 * Time:00:22
 */

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepository projectRepository;
    @Override
    public Long createProject(Project project) {
        return projectRepository.save(project).getId();
    }

    @Override
    public List<Project> getAllProjects() {
        return (List<Project>) projectRepository.findAll();
    }

    @Override
    public Optional<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    @Override
    public Page<Project> searchAndFilterProject(ProjectSearchAndFilterRequest searchRequest) {
        Pageable pageable = UtilService.getPageable(searchRequest);
        String searchText = searchRequest.getSearchText();
        if(searchRequest.getSearchText() != null){
            searchText = "%" + searchText + "%";
        }
        return projectRepository.search(searchText, searchRequest.getStartDate(), searchRequest.getEndDate(), pageable);
    }
}
