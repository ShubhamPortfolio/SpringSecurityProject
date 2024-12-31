package com.learning.EazyBankBackendApplication.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/notices")
    public String getNotices()
    {
        return "Here Are the Notices details From DB";
    }
}
