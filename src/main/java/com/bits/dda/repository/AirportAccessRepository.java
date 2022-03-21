package com.bits.dda.repository;

import com.bits.dda.model.Airport;
import com.bits.dda.model.AirportAccess;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface AirportAccessRepository extends ReactiveSortingRepository<AirportAccess, Long>, ReactiveQueryByExampleExecutor<AirportAccess> {
}
