package com.pagination.helpers;

import com.pagination.dto.ProjectSearchAndFilterRequest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.Objects;

/**
 * Author: Zeeshan Adil
 * User:mhmdz
 * Date:24-03-2024
 * Time:00:14
 */

public class UtilService {

    public static Pageable getPageable(ProjectSearchAndFilterRequest searchRequest){
        String sortBy = searchRequest.getSortBy();
        String direction = searchRequest.getDirection();
        Sort.Direction sortDirection;
        if (searchRequest.getPageNo() == null || searchRequest.getPageSize() == null) {
            return null;
        }
        if(searchRequest.getSortBy() == null || searchRequest.getSortBy().isBlank()){
            sortBy = "id";
        }
        if(searchRequest.getDirection() == null || searchRequest.getDirection().isBlank()){
            direction = "DESC";
        }
        sortDirection = Sort.Direction.fromString(direction);
        return PageRequest.of(searchRequest.getPageNo(), searchRequest.getPageSize(), sortDirection, sortBy);

    }

}