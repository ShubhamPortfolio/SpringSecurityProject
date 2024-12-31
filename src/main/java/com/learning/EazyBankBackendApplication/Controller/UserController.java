package com.learning.EazyBankBackendApplication.Controller;

import com.learning.EazyBankBackendApplication.Model.Customer;
import com.learning.EazyBankBackendApplication.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {


    private final CustomerRepository customerRepository;
    private final PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<String> registeruser(@RequestBody Customer customer)
    {
        try {

            String hashpwd=passwordEncoder.encode(customer.getPwd());
            customer.setPwd(hashpwd);
            Customer savedCustomer= customerRepository.save(customer);

            if (savedCustomer.getId()>0)
            {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                        body("given User Details are successfully registered ");
            }
            else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).
                        body("User registration failed");
            }

        } catch (Exception ex) {

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
                    body("An Exception occured" +ex.getMessage());
        }
    }

}