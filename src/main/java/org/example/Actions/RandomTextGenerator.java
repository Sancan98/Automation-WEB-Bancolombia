package org.example.Actions;

import java.util.Random;

public class RandomTextGenerator {
    public static String generateRandomText(int length) {
        Random random = new Random();
        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            texto.append(randomChar);
        }
        return texto.toString();
    }

}
