package com.thesol.taro.controllers;

import com.thesol.taro.dto.UserDto;
import com.thesol.taro.models.users.Company;
import com.thesol.taro.models.users.User;
import com.thesol.taro.repository.UserRepository;
import com.thesol.taro.service.CompanyService;
import com.thesol.taro.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/user")
@Slf4j
public class UserController {
    private final CompanyService companyService;
    private final UserService userService;
    private final UserRepository userRepository;

    @PostMapping("/add-user")
    public ResponseEntity<String> makeNewUser(@RequestBody User user) {
        Company company = companyService.getAuthCompany();
        if(company != null) {
            userService.addUserToCompany(company.getId(), user);

            log.info("Company " + company.getName() + " make new user " + user.getFirstName());
            return ResponseEntity.ok("User was added");
        }
        return ResponseEntity.badRequest().body("User wasn't added");
    }

    @GetMapping("/all-users")
    public Set<UserDto> getAllUsers() {
        Set<UserDto> userDtoSet = new HashSet<>();
        Company company = companyService.getAuthCompany();
        if(company != null) {
            for(User user : company.getUsers()) {
                userDtoSet.add(UserDto.makeUserDto(user));
            }
            return userDtoSet;
        }
        return null;
    }

    @DeleteMapping("/delete-user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        log.info("User with id %d was deleted", id);
        return ResponseEntity.ok("User with id " + id + " was deleted");
    }


}
