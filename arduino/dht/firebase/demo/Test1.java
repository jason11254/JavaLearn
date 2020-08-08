package com.lab.arduino.dht.firebase.demo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import com.firebase.net.thegreshams.firebase4j.model.FirebaseResponse;
import com.firebase.net.thegreshams.firebase4j.service.Firebase;

public class Test1 {
    
    public static void main(String[] args) throws Throwable {
        String firebase_baseUrl = "https://zlwuapp.firebaseio.com/dht";
        String token = "dxiZS4ippmuj7pLkxqmHkBgpXr7nYFyFzuKUgzGL";
        // create the firebase
        Firebase firebase = new Firebase(firebase_baseUrl, token);
        while (true) {
            Map<String, Object> dataMap = new LinkedHashMap<>();
            dataMap.put("random", new Random().nextInt(1000));
            FirebaseResponse response = firebase.patch(dataMap );
            System.out.println(firebase.get("random").getRawBody());
            
        }
    }
}
