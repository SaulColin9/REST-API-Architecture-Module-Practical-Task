package org.cloud.converter;

import org.springframework.core.convert.converter.Converter;
import org.domain.User;
import org.dto.UserResponseDto;
import org.springframework.stereotype.Component;

@Component
public class UserToUserResponseDtoConverter implements Converter<User, UserResponseDto> {

    @Override
    public UserResponseDto convert(User user) {
        UserResponseDto dto = new UserResponseDto();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setSurname(user.getUsername());
        dto.setBirthday(user.getBirthday().toString());
        return dto;
    }
}