package utils;

import java.util.UUID;

public class DataGenerator {
        public static String getName() {
            return "User" + UUID.randomUUID().toString().substring(0, 5);
        }

    public static String getEmail() {
        return "user" + UUID.randomUUID().toString().substring(0, 5) + "@test.com";
    }

    public static String getPassword() {
        return "Pass@" + UUID.randomUUID().toString().substring(0, 4);
    }
}