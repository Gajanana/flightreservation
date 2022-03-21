package com.bits.dda.repository;

import com.bits.dda.model.Transactions;
import com.bits.dda.model.Trip;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface TripRepository extends ReactiveSortingRepository<Trip, Long>, ReactiveQueryByExampleExecutor<Trip> {
}
