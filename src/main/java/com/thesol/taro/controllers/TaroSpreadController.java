package com.thesol.taro.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/taro")
public class TaroSpreadController {

    @GetMapping("/{first_id}/{second_id}")
    public void makeSpread(@PathVariable Long first_id, @PathVariable Long second_id) {

    }
}
