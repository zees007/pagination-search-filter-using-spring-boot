package com.pagination.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.domain.Sort;

/**
 * Author: Zeeshan Adil
 * User:mhmdz
 * Date:23-03-2024
 * Time:01:45
 */

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PaginationRequest {

    private Integer pageNo;
    private Integer pageSize;
    private String sortBy;
    private String direction;

}
