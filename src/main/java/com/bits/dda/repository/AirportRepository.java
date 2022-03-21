package com.bits.dda.repository;

import com.bits.dda.model.Airline;
import com.bits.dda.model.Airport;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface AirportRepository extends ReactiveSortingRepository<Airport, Long>, ReactiveQueryByExampleExecutor<Airport> {
}
