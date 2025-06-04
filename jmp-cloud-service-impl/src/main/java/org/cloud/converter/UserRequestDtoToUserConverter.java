package org.cloud.converter;


import org.springframework.core.convert.converter.Converter;
import org.dto.UserRequestDto;
import org.domain.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class UserRequestDtoToUserConverter implements Converter<UserRequestDto, User> {

    @Override
    public User convert(UserRequestDto dto) {
        User user = new User();
        user.setId(dto.getId());
        user.setName(dto.getName());
        user.setUsername(dto.getSurname());
        user.setBirthday(LocalDate.parse(dto.getBirthday()));
        return user;
    }
}