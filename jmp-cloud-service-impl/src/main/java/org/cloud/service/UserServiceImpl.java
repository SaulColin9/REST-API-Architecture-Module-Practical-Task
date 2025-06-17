package org.cloud.service;

import org.cloud.converter.UserRequestDtoToUserConverter;
import org.cloud.converter.UserToUserResponseDtoConverter;
import org.cloud.repository.user.UserRepository;
import org.domain.User;
import org.dto.UserRequestDto;
import org.dto.UserResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserToUserResponseDtoConverter userResponseDtoConverter;
    @Autowired
    private UserRequestDtoToUserConverter requestDtoToUserConverter;


    @Override
    public UserResponseDto createUser(UserRequestDto dto) {
        User user = userRepository.save(requestDtoToUserConverter.convert(dto));
        return userResponseDtoConverter.convert(user);
    }

    @Override
    public UserResponseDto updateUser(UserRequestDto dto) {
        User user = userRepository.update(requestDtoToUserConverter.convert(dto));
        return userResponseDtoConverter.convert(user);
    }

    @Override
    public boolean deleteUser(Long id) {
        return userRepository.delete(id);
    }

    @Override
    public UserResponseDto getUser(Long id) {
        return userResponseDtoConverter.convert(userRepository.get(id));
    }

    @Override
    public List<UserResponseDto> getAllUser() {
        return userRepository.getAll().stream()
                .map(userResponseDtoConverter::convert)
                .toList();
    }
}
