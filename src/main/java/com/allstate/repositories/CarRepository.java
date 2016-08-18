package com.allstate.repositories;


import com.allstate.models.Car;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CarRepository extends PagingAndSortingRepository<Car, Integer> {
}
