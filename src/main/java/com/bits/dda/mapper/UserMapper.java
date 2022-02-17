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
       @Mapping(target = "version", ignore = true)
//    @Mapping(target = "lastName", ignore = false)
//    @Mapping(target = "email", ignore = false)
//    @Mapping(target = "phoneNumber", ignore = false)
    User toModel(UserResource userResource);

}