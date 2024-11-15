package com.thesol.taro.security;

import com.thesol.taro.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomCompanyService implements UserDetailsService {
    private final CompanyRepository companyRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return companyRepo.findByEmail(username).map(CustomCompanyDetails::new).orElseThrow(() -> new UsernameNotFoundException(username));
    }
}
