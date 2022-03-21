package com.bits.dda.repository;

import com.bits.dda.model.Aircraft;
import com.bits.dda.model.User;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface AircraftRepository extends ReactiveSortingRepository<Aircraft, Long>, ReactiveQueryByExampleExecutor<Aircraft> {

    @Query("SELECT * FROM user WHERE last_name = :lastname")
    Flux<User> findByName(String lastName);

    //Flux<User> findAllBy(Pageable pageable);
//    @Query("SELECT * FROM flightuser WHERE id = :id")
//    Mono<User> findById(String id);

}