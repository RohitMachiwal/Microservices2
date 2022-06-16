package com.contact.service;

import com.contact.entities.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    List<Contact> list= List.of(
            new Contact(2001L,"Rohit4356@gmail.com","RM",1001L),
            new Contact(2002L,"Mayank123@hotmail.com","MK",1002L),
            new Contact(2003L,"Shyam4578@yahoo.com","SRK",1003L)
    );

    @Override
    public List<Contact> getContactsofUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
