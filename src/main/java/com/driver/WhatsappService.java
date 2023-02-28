package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WhatsappService {
    @Autowired
    WhatsappRepository whatsappRepository;

    public String createUser(String name, String mobile) {
        return whatsappRepository.createUser(name,mobile);
    }

    public Group createGroup(List<User> users) {

        return whatsappRepository.createGroup(users);
    }
}
