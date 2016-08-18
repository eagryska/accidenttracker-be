package com.allstate.repositories;

import com.allstate.models.Client;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClientRepository extends PagingAndSortingRepository<Client, Integer> {
}
