package org.example.Actions;

import java.util.Random;

public class RandomNumberGenerator {
    public static String generateRandomNumber(int length) {
        Random random = new Random();
        StringBuilder numero = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int digito = random.nextInt(10); // Genera un dígito aleatorio entre 0 y 9
            numero.append(digito);
        }

        return numero.toString();
    }
}

