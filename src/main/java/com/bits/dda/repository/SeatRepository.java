package com.bits.dda.repository;

import com.bits.dda.model.Airline;
import com.bits.dda.model.Seat;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface SeatRepository extends ReactiveSortingRepository<Seat, Long>, ReactiveQueryByExampleExecutor<Seat> {
}
