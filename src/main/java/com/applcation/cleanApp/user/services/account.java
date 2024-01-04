package com.applcation.cleanApp.user.services;

import com.applcation.cleanApp.user.user;
import com.applcation.cleanApp.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class account {
    private final userRepository userRepository;
    @Autowired
    public account(userRepository userRepository){
        this.userRepository = userRepository;
    }

    public user createAccount(user user){
        return userRepository.save(user);
    }
    public boolean isAutoUsernameExists(String autoUsername) {
        return userRepository.existsByAutoUsername(autoUsername);
    }
    public boolean isPhoneNumberExists(String phoneNumber) {
        return userRepository.existsByPhoneNumber(phoneNumber);
    }
    public user getGetIdentityComfirmationCodeByPhoneNumber(String phoneNumber, String code) {
        user user = userRepository.findByPhoneNumber(phoneNumber);
        if (user != null) {
            if ((user.getIdentityComfirmationCode()).equals(code)){
                return user;
            }
            return null;
        } else {
            return null;
        }
    }

}
