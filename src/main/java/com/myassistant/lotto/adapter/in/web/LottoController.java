package com.myassistant.lotto.adapter.in.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LottoController {

    @GetMapping("hello")
    public String hello() {
        return "Hello Lotto";
    }
}
