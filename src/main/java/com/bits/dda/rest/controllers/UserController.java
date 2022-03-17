package com.bits.dda.rest.controllers;

import com.bits.dda.mapper.UserMapper;
import com.bits.dda.model.User;
import com.bits.dda.rest.api.UserResource;
import com.bits.dda.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.MediaType.TEXT_EVENT_STREAM_VALUE;
import static org.springframework.http.ResponseEntity.created;

@RestController
@RequestMapping(value = "/tflight/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;

    @Operation(summary = "Find User", description ="Find an User by id")
    @GetMapping(value = "/{id}", produces = {APPLICATION_JSON_VALUE})
    public Mono<UserResource> findById(@PathVariable final Long id) {

        return userService.findById(id).map(userMapper::toResource).onErrorReturn(
                new UserResource(420L,"dont","exist", "defaultuser@a.com","9786543222"));
    }

    @Operation(summary ="Get the people")
    @GetMapping(produces = TEXT_EVENT_STREAM_VALUE)
    public Flux<UserResource> getAll() {

        return userService.findAll()
                .map(userMapper::toResource).delayElements(Duration.ofSeconds(1));
    }


    @Operation(summary ="Finding Performance")
    @GetMapping(value = "/performance")//,produces = TEXT_EVENT_STREAM_VALUE)
    public void performance() {
        Instant start = Instant.now();
        List<Mono<Long>> list = Stream.of(1,2,3,4,5,6,7).map(i->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            return Mono.just(i.longValue());
        }).collect(Collectors.toList());
//        Mono.when(list).block();
        list.forEach(mono-> mono.subscribe(i-> System.out.println("my i"+i)));

        System.out.println("Time is "+  start.minusMillis(Instant.now().toEpochMilli()));
        Instant start1 = Instant.now();
        Flux<Long> flux = Flux.range(1,7).flatMap(i->{
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            return Mono.just(i.longValue());
        });
        //Mono.when(list).block();
        flux.subscribe(i-> System.out.println("my 2"+i));
        //flux.forEach(flx-> flx.subscribe(i-> System.out.println("my 2"+i)));
        System.out.println("Time2 is "+  start1.minusMillis(Instant.now().toEpochMilli()));

    }


    @Operation(summary = "Find User", description ="Find an User by id")
    @PostMapping(value = "register/{id}", produces = {APPLICATION_JSON_VALUE})
    public Mono<User> register(@Valid @RequestBody final UserResource userResource) {

        return userService.create(userMapper.toModel(userResource));
         //       .map(item -> created(linkTo(UserController.class).slash(item.getId()).toUri()).build());

    }
}
