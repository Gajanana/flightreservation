package com.bits.dda.service;

import com.bits.dda.Exceptions.ItemNotFoundException;
import com.bits.dda.model.User;
import com.bits.dda.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {

    // Note that the name of the fields to be sorted on are the DB field names
    private static final Sort DEFAULT_SORT = Sort.by(Sort.Order.by("first_name"));

    private final UserRepository userRepository;

    public Flux<User> findAll() {
        return userRepository.findAll(DEFAULT_SORT);
    }

    /**
     * Find a User
     *
     * @param id      identifier of the User
     * @return the User
     */
    public Mono<User> findById(final Long id) {

        return userRepository.findById(id)
                .switchIfEmpty(Mono.error(new ItemNotFoundException(id)));
    }


    /**
     * Create a new User
     * @param user User to be created
     *
     * @return the saved item without the related entities
     */
    @Transactional
    public Mono<User> create(User user) {

        if(user.getId() != null || user.getVersion() != null) {
            return Mono.error(new IllegalArgumentException("When creating an user, the id and the version must be null"));
        }

        System.out.println("user is "+user);
        return  // Save the new item
                userRepository.save(user);
                        // Save the links to the tags
//                        .flatMap(savedItem ->
//                                itemTagRepository.saveAll(tagMapper.toItemTags(savedItem.getId(), savedItem.getTags()))
//                                        .collectList()
//                                        // Return the newly created item
//                                        .then(Mono.just(savedItem)));
    }

}
