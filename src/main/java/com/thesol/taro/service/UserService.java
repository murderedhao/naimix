package com.thesol.taro.service;

import com.thesol.taro.models.users.Company;
import com.thesol.taro.models.users.User;
import com.thesol.taro.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final CompanyRepository companyRepository;

    public void addUserToCompany(Long companyId, User user) {
        Company company = companyRepository.findById(companyId).orElseThrow(() -> new RuntimeException("Company not found"));

        company.addUser(user);
        companyRepository.save(company);
    }
}
