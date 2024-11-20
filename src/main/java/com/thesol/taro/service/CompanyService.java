package com.thesol.taro.service;

import com.thesol.taro.dto.CompanyCredentialDto;
import com.thesol.taro.dto.JwtAuthenticationDto;
import com.thesol.taro.models.users.Company;
import com.thesol.taro.repository.CompanyRepository;
import com.thesol.taro.security.jwt.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public boolean registerCompany(Company company) {
        if(company != null) {
            company.setPassword(passwordEncoder.encode(company.getPassword()));
            companyRepository.save(company);
            return true;
        }
        return false;
    }

    public JwtAuthenticationDto signIn(CompanyCredentialDto companyCredentialDto) {
        Company company = findByCredentials(companyCredentialDto);
        return jwtService.generateJwtAuthToken(company.getEmail());
    }

    private Company findByCredentials(CompanyCredentialDto companyCredentialDto) {
        Optional<Company> optionalCompany = companyRepository.findByEmail(companyCredentialDto.getEmail());
        if(optionalCompany.isPresent()) {
            Company company = optionalCompany.get();
            if(passwordEncoder.matches(companyCredentialDto.getPassword(), company.getPassword())) {
                return company;
            }
        }
        throw new AuthenticationServiceException("Email or password is incorrect");
    }

    public Company getAuthCompany() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Company company = null;

        if(auth != null && auth.isAuthenticated()) {
            String email = auth.getName();
            Optional<Company> companyOptional = companyRepository.findByEmail(email);
            company = companyOptional.get();
            return company;
        }

        return null;
    }


}
