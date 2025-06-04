package org.cloud.service;

import org.domain.User;
import org.dto.UserRequestDto;
import org.dto.UserResponseDto;

import java.util.List;

public interface UserService {
    UserResponseDto createUser(UserRequestDto dto);
    UserResponseDto updateUser(UserRequestDto dto);
    boolean deleteUser(Long id);
    UserResponseDto getUser(Long id);
    List<UserResponseDto> getAllUser();
}
