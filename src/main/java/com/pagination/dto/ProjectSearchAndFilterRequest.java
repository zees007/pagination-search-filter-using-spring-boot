package com.pagination.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.domain.Sort;

import java.util.Date;

/**
 * Author: Zeeshan Adil
 * User:mhmdz
 * Date:23-03-2024
 * Time:01:38
 */

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProjectSearchAndFilterRequest extends PaginationRequest {

    // this is the lookup text for search
    private String searchText;
    private Date startDate;
    private Date endDate;

}