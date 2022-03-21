package com.bits.dda.repository;

import com.bits.dda.model.Hop;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface HopRepository extends ReactiveSortingRepository<Hop, Long>, ReactiveQueryByExampleExecutor<Hop> {
}
