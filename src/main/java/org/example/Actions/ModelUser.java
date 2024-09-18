package org.example.Actions;

import org.example.Users.Users;
import org.example.Users.UserConstanst;

import java.util.List;

public class ModelUser {
    public static Users findUser(String actor) {
        List<Users> users = UserConstanst.USERS;
        for (Users user : users) {
            if (user.getName().equals(actor)) {
                // Retorna el usuario si lo encuentra
                return user;
            }
        }
        // Retorna null si no se encuentra el usuario
        return null;
    }
}
