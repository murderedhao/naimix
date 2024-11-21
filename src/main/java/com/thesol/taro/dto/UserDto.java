package com.thesol.taro.dto;

import com.thesol.taro.models.users.Gender;
import com.thesol.taro.models.users.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
public class UserDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Set<Gender> gender;
    private LocalDate birthDay;

    private UserDto() {}

    public static UserDto makeUserDto(User user) {
        UserDto userDto = new UserDto();

        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPhoneNumber(user.getPhoneNumber());
        userDto.setGender(user.getGender());
        userDto.setBirthDay(user.getBirthDate());

        return userDto;
    }
}
