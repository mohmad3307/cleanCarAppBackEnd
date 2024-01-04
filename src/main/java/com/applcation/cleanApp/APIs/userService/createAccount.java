package com.applcation.cleanApp.APIs.userService;

import com.applcation.cleanApp.base64.encryptionFunctions;
import com.applcation.cleanApp.user.services.account;
import com.applcation.cleanApp.user.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
@RequestMapping("/user")
public class createAccount {
    private final com.applcation.cleanApp.user.services.account account;
    @Autowired
    public createAccount(account account){
        this.account = account;
    }
    @GetMapping("/getRandomNumber/{phoneNumber}/{code}")
    public ResponseEntity<?> getGetIdentityComfirmationCodeByPhoneNumber(@PathVariable String phoneNumber,@PathVariable String code) {
        user user = account.getGetIdentityComfirmationCodeByPhoneNumber(phoneNumber, code);
        if (user != null){
            return ResponseEntity.status(HttpStatus.OK).body(user);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @PostMapping("/enterOrCreateAccount")
    public ResponseEntity<?> Enter(@RequestBody user user){
        System.out.println(user.getPhoneNumber());
        if (account.isPhoneNumberExists(user.getPhoneNumber())){
            return ResponseEntity.status(HttpStatus.OK).body("YOU ENTER THE ACCOUNT");
        }
        else {
            return create(user.getPhoneNumber());
        }
    }



    private ResponseEntity<?> create( String phoneNumber){
        try{
            Random rnd = new Random();
            String IdentityComfirmationCode = "";
            for (int i = 0; i < 4; i++){
                IdentityComfirmationCode += ("" + rnd.nextInt(10));
            }
            String autoUsername = phoneNumber;
            do {
                for (int i = 0; i < 4; i++) {
                    autoUsername = encryptionFunctions.GenerateRamdomEncryption(autoUsername);
                }
            } while (account.isAutoUsernameExists(autoUsername));
            String autoPassword = encryptionFunctions.GenerateRamdomEncryption(phoneNumber);
            user savedUser = new user(phoneNumber,IdentityComfirmationCode,autoUsername,autoPassword);
            user createdUser = account.createAccount(savedUser);

            if (createdUser != null){
                createdUser.print();
                return ResponseEntity.status(HttpStatus.CREATED).body("true");
            }
            else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("false");
            }
        }
        catch (Exception e){
            return ResponseEntity.status(HttpStatus.CREATED).body("false");
        }
    }
}