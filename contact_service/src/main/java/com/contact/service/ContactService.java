package com.contact.service;

import com.contact.entities.Contact;

import java.util.List;

public interface ContactService {

    public List<Contact> getContactsofUser(Long  userId);
}
