package org.rest.controller;

import org.dto.UserRequestDto;
import org.dto.UserResponseDto;

import java.util.List;

public interface UserController {
    UserResponseDto createUser(UserRequestDto dto);
    UserResponseDto updateUser(UserRequestDto dto);
    boolean deleteUser(Long id);
    UserResponseDto getUser(Long id);
    List<UserResponseDto> getAllUser();
}
