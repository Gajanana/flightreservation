package com.bits.dda.repository;

import com.bits.dda.model.Trip;
import com.bits.dda.model.TripHop;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface TripHopRepository extends ReactiveSortingRepository<TripHop, Long>, ReactiveQueryByExampleExecutor<TripHop> {
}
