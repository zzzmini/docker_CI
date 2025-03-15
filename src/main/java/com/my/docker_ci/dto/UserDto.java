package com.my.docker_ci.dto;

import com.my.docker_ci.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
    private Long id;
    private String name;

    public static UserDto fromEntity(User user) {
        return new UserDto(
                user.getId(),
                user.getName()
        );
    }
}
