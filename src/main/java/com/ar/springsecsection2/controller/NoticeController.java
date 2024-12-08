package com.ar.springsecsection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeController {



    @GetMapping("/notice")
    public String getBalanceDetails() {
        return "Here are the notice details from the DB..";
    }
}
