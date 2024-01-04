package com.applcation.cleanApp.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Map;
import java.util.HashMap;

@Document(collection = "user")
public class user {
    @Id
    private String id;

    private String firstName;
    private String LastName;
    private String phoneNumber;
    private String identityComfirmationCode;
    private String autoUsername;
    private String autoPassword;
    private Map<String,userCars> Cars;

    public user(String phoneNumber, String identityComfirmationCode, String autoUsername, String autoPassword) {
        this.phoneNumber = phoneNumber;
        this.identityComfirmationCode = identityComfirmationCode;
        this.autoUsername = autoUsername;
        this.autoPassword = autoPassword;
    }

    public user(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public user() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getIdentityComfirmationCode() {
        return identityComfirmationCode;
    }

    public void setIdentityComfirmationCode(String identityComfirmationCode) {
        this.identityComfirmationCode = identityComfirmationCode;
    }

    public String getAutoUsername() {
        return autoUsername;
    }

    public void setAutoUsername(String autoUsername) {
        this.autoUsername = autoUsername;
    }

    public String getAutoPassword() {
        return autoPassword;
    }

    public void setAutoPassword(String autoPassword) {
        this.autoPassword = autoPassword;
    }

    public Map<String, userCars> getCars() {
        return Cars;
    }

    public void setCars(String licensePlate, userCars car) {
        this.Cars.put(licensePlate, car);
    }

    public void print(){
        System.out.println( "User{\n" +
                    "   firstName: " + firstName + '\n' +
                    "   LastName: " + LastName + '\n' +
                    "   phoneNumber: " + phoneNumber + '\n' +
                    "   identityComfirmationCode: " + identityComfirmationCode + '\n' +
                    "   autoUsername: " + autoUsername + '\n' +
                    "   autoPassword: " + autoPassword + '\n' +
                    "   Cars: " + Cars +
                    "\n}");
    }
}
