package com.example.shellee.repo;

import com.example.shellee.domain.TourPackage;
import org.springframework.data.repository.CrudRepository;

/**
 * Tour Package Repository Interface
 *
 * Created by Mary Ellen Bowman
 */
public interface TourPackageRepository extends CrudRepository<TourPackage, String> {
    TourPackage findByName(String name);
}

