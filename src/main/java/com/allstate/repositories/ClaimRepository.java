package com.allstate.repositories;


import com.allstate.models.Claim;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClaimRepository extends PagingAndSortingRepository<Claim, Integer> {
}
