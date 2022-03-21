package com.bits.dda.repository;

import com.bits.dda.model.Hop;
import com.bits.dda.model.Passenger;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface PassengerRepository extends ReactiveSortingRepository<Passenger, Long>, ReactiveQueryByExampleExecutor<Passenger> {
}
