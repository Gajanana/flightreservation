package com.bits.dda.repository;

import com.bits.dda.model.Contact;
import com.bits.dda.model.Country;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface CountryRepository extends ReactiveSortingRepository<Country, Long>, ReactiveQueryByExampleExecutor<Country> {
}
