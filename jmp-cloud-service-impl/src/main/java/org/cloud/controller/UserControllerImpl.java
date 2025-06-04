package org.cloud.controller;

import org.cloud.service.UserServiceImpl;
import org.dto.UserRequestDto;
import org.dto.UserResponseDto;
import org.rest.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControllerImpl implements UserController {
    @Autowired
    private UserServiceImpl userService;
    @Override
    @PostMapping
    public UserResponseDto createUser(@RequestBody UserRequestDto dto) {
        return userService.createUser(dto);
    }

    @Override
    @PutMapping
    public UserResponseDto updateUser(@RequestBody UserRequestDto dto) {
        return userService.updateUser(dto);
    }

    @Override
    @DeleteMapping("/{id}")
    public boolean deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

    @Override
    @GetMapping("/{id}")
    public UserResponseDto getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @Override
    @GetMapping
    public List<UserResponseDto> getAllUser() {
        return userService.getAllUser();
    }
}
