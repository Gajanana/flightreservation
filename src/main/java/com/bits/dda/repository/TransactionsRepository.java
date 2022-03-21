package com.bits.dda.repository;

import com.bits.dda.model.Transactions;
import com.bits.dda.model.User;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface TransactionsRepository extends ReactiveSortingRepository<Transactions, Long>, ReactiveQueryByExampleExecutor<Transactions> {
}
