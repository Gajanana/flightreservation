package com.bits.dda.repository;

import com.bits.dda.model.State;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface StateRepository extends ReactiveSortingRepository<State, Long>, ReactiveQueryByExampleExecutor<State> {
}
