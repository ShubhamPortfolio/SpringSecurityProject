package com.learning.EazyBankBackendApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {

    @GetMapping("/myBalance")
    public String getBalanceDetails()
    {
        return "Here Is my Balnce from DB";
    }
}
