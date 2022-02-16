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

        return userService.findById(id).map(userMapper::toResource);
    }

    @Operation(summary ="Get the people")
    @GetMapping(produces = TEXT_EVENT_STREAM_VALUE)
    public Flux<UserResource> getAll() {

        return userService.findAll()
                .map(userMapper::toResource);
    }


    @Operation(summary = "Find User", description ="Find an User by id")
    @PostMapping(value = "register/{id}", produces = {APPLICATION_JSON_VALUE})
    public Mono<User> register(@Valid @RequestBody final UserResource userResource) {

        return userService.create(userMapper.toModel(userResource));
         //       .map(item -> created(linkTo(UserController.class).slash(item.getId()).toUri()).build());

    }
}
