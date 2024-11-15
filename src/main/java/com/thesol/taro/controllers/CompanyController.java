package com.thesol.taro.controllers;

import com.thesol.taro.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/log")
public class CompanyController {
    private final CompanyService companyService;

    public ResponseEntity
}
