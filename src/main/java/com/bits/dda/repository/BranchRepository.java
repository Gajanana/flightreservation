package com.bits.dda.repository;

import com.bits.dda.model.Airport;
import com.bits.dda.model.Branch;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface BranchRepository extends ReactiveSortingRepository<Branch, Long>, ReactiveQueryByExampleExecutor<Branch> {
}
