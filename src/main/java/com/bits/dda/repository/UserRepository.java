package com.bits.dda.repository;

import com.bits.dda.model.User;
import org.springframework.data.r2dbc.repository.Query;
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
public interface UserRepository extends ReactiveSortingRepository<User, Long> {

    @Query("SELECT * FROM flightuser WHERE last_name = :lastname")
    Flux<User> findByLastName(String lastName);
//    @Query("SELECT * FROM flightuser WHERE id = :id")
//    Mono<User> findById(String id);

}