package com.thesol.taro.controllers;

import com.thesol.taro.dto.CompanyCredentialDto;
import com.thesol.taro.dto.JwtAuthenticationDto;
import com.thesol.taro.models.users.Company;
import com.thesol.taro.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")
public class CompanyController {
    private final CompanyService companyService;

    @PostMapping("/signIn")
    public ResponseEntity<JwtAuthenticationDto> signIn(@RequestBody CompanyCredentialDto companyCredentialDto) {
        JwtAuthenticationDto jwtAuthenticationDto = companyService.signIn(companyCredentialDto);
        return ResponseEntity.ok(jwtAuthenticationDto);
    }

    @PostMapping("/register")
    public ResponseEntity<String> registration(@RequestBody Company company) {
        if(companyService.registerCompany(company)) {
            return ResponseEntity.ok("Company registered successfully");
        }
        return ResponseEntity.badRequest().build();
    }


}
