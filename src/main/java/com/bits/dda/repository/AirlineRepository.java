package com.bits.dda.repository;

import com.bits.dda.model.Airline;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface AirlineRepository extends ReactiveSortingRepository<Airline, Long>, ReactiveQueryByExampleExecutor<Airline> {
}
