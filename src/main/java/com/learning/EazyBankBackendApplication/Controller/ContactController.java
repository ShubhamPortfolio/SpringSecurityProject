package com.learning.EazyBankBackendApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/contact")
    public String saveContactInquiryDetails()
    {
        return "Inquiry Dtails Saved In DB";
    }
}
