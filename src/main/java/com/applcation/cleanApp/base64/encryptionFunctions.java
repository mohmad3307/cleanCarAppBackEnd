package com.applcation.cleanApp.base64;

import  com.applcation.cleanApp.Time.UTC;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Base64;

public class encryptionFunctions {
    public static String GenerateRamdomEncryption(String str){

        byte[] encodedBytes = Base64.getEncoder().encode((str).getBytes());
        String encodedText = new String(encodedBytes);
        return encodedText;
    }
}
