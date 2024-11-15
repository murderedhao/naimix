package com.thesol.taro.service;

import com.thesol.taro.models.users.Company;
import com.thesol.taro.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;
    private final PasswordEncoder passwordEncoder;

    public boolean registerCompany(Company company) {
        company.setPassword(passwordEncoder.encode(company.getPassword()));
        companyRepository.save(company);
        return true;
    }


}
