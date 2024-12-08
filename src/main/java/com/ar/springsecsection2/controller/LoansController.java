package com.ar.springsecsection2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {



    @GetMapping("/myLoans")
    public String getContactDetails() {
        return "Here are the Loans details from the DB..";

    }
}
