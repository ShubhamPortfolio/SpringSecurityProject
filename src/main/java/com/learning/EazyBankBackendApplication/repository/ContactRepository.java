package com.learning.EazyBankBackendApplication.repository;

import com.learning.EazyBankBackendApplication.Model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends CrudRepository<Contact, String> {


}