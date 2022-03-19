package com.bits.dda.repository;

import com.bits.dda.model.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


//@Repository
//public interface UserRepository extends ReactiveSortingRepository<User, Long> {
//
//
//}

@Repository
public interface UserRepository extends ReactiveSortingRepository<User, Long>, ReactiveQueryByExampleExecutor<User> {

    @Query("SELECT * FROM flightuser WHERE last_name = :lastname")
    Flux<User> findByLastName(String lastName);

    //Flux<User> findAllBy(Pageable pageable);
//    @Query("SELECT * FROM flightuser WHERE id = :id")
//    Mono<User> findById(String id);

}