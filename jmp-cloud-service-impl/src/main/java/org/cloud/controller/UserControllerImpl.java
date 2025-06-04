package org.cloud.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.cloud.service.UserService;
import org.dto.UserRequestDto;
import org.dto.UserResponseDto;
import org.rest.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Tag(name = "User API", description = "CRUD API for users")
public class UserControllerImpl implements UserController {
    @Autowired
    private UserService userService;
    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Create a new user", description = "Adds a new user to storage")
    public UserResponseDto createUser(@RequestBody UserRequestDto dto) {
        return userService.createUser(dto);
    }

    @Override
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Updates user", description = "Updates an existing user")
    public UserResponseDto updateUser(@RequestBody UserRequestDto dto) {
        return userService.updateUser(dto);
    }

    @Override
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "Delete user", description = "Deletes an existing user")
    public boolean deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }

    @Override
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Get user", description = "Retrieves an existing user")
    public UserResponseDto getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @Override
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Get users", description = "Returns a list of all available users")
    public List<UserResponseDto> getAllUser() {
        return userService.getAllUser();
    }
}
