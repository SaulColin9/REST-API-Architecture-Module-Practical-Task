package org.example.controller;

import org.example.dto.UserRequestDto;
import org.example.dto.UserResponseDto;

import java.util.List;

public interface UserController {
    UserResponseDto createUser(UserRequestDto dto);
    UserResponseDto updateUser(UserRequestDto dto);
    boolean deleteUser(Long id);
    UserResponseDto getUser(Long id);
    List<UserResponseDto> getAllUser(UserRequestDto dto);
}
