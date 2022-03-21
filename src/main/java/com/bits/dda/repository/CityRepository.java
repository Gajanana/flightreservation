package com.bits.dda.repository;

import com.bits.dda.model.Branch;
import com.bits.dda.model.City;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface CityRepository  extends ReactiveSortingRepository<City, Long>, ReactiveQueryByExampleExecutor<City> {
}
