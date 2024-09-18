package org.example.models;

import org.example.Users.UserConstanst;
import org.example.Users.Users;

import java.util.List;

public class ModelUser {
    // Se crean estructuras de tipo objeto con el fin de que sean representados de manera virtual en este caso puede ser un usuario
    // Ejemplo : user, password, token etc

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
