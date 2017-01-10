package com.example.shellee.repo;

import com.example.shellee.domain.Tour;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Tour Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourRepository extends CrudRepository<Tour,Integer> {
    List<Tour> findByTourPackageCode(String code);
}
