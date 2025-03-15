package com.my.docker_ci.service;

import com.my.docker_ci.dto.UserDto;
import com.my.docker_ci.entity.User;
import com.my.docker_ci.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void saveUser(UserDto dto) {
        User saveUser = new User();
        saveUser.setName(dto.getName());
        userRepository.save(saveUser);
    }

    public List<UserDto> getAllUsers() {
        return
                userRepository
                        .findAll()
                        .stream()
                        .map(UserDto::fromEntity)
                        .toList();
    }
}
