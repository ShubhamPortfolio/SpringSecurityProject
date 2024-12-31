package com.learning.EazyBankBackendApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {

    @GetMapping("/myCards")
    public String getCardsDetails()
    {
        return "Here is my Card Details From DB";
    }
}
