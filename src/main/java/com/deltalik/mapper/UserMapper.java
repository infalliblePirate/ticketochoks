package com.deltalik.mapper;

import com.deltalik.dto.user.UserResponseDto;
import com.deltalik.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants.ComponentModel;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

//  @Mapping(target = "password", ignore = true)
  UserResponseDto toUserResponseDto(User user);
}
