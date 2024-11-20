package com.thesol.taro.controllers;

import com.thesol.taro.models.users.Company;
import com.thesol.taro.models.users.User;
import com.thesol.taro.repository.CompanyRepository;
import com.thesol.taro.service.CompanyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.parameters.P;
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

    @PostMapping("/add-user")
    public ResponseEntity<String> makeNewUser(@RequestBody User user) {
        Company company = companyService.getAuthCompany();
        if(company != null) {
            company.getUsers().add(user);
            log.info("Company " + company.getName() + " make new user " + user.getFirstName());
            return ResponseEntity.ok("User was added");
        }
        return ResponseEntity.badRequest().body("User wasn't added");
    }


}
