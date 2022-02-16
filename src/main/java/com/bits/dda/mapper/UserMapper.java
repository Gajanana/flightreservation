package com.bits.dda.mapper;

import com.bits.dda.model.User;
import com.bits.dda.rest.api.UserResource;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface UserMapper {

    UserResource toResource(User user);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "firstName", ignore = true)
    @Mapping(target = "lastName", ignore = true)
    @Mapping(target = "email", ignore = true)
    @Mapping(target = "phoneNumber", ignore = true)
    User toModel(UserResource userResource);

}