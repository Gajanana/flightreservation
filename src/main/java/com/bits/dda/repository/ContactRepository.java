package com.bits.dda.repository;

import com.bits.dda.model.Branch;
import com.bits.dda.model.Contact;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;

public interface ContactRepository extends ReactiveSortingRepository<Contact, Long>, ReactiveQueryByExampleExecutor<Contact> {
}
