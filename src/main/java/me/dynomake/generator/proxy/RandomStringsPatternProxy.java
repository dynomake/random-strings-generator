package me.dynomake.generator.proxy;

import lombok.AllArgsConstructor;
import lombok.val;
import me.dynomake.generator.RandomStringsPattern;

import java.util.Random;

@AllArgsConstructor
public class RandomStringsPatternProxy implements RandomStringsPattern {

    private static final Random random = new Random();

    private String characters;

    @Override
    public RandomStringsPattern letters() {
        characters += "abcdefghijklmnopqrstuvwxyz";
        return this;
    }

    @Override
    public RandomStringsPattern capitalLetters() {
        characters += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return this;
    }

    @Override
    public RandomStringsPattern numbers() {
        characters += "0123456789";
        return this;
    }

    @Override
    public RandomStringsPattern spaces() {
        characters += " ";
        return this;
    }

    @Override
    public RandomStringsPattern symbols() {
        characters += "!@#$%^&*()-_=+[]{}|;:',.<>/?";
        return this;
    }

    @Override
    public String next(int length) {
        if (characters.isEmpty())
            throw new IllegalArgumentException("Cant generate string!");

        val string = new StringBuilder(length);

        for (int i = 0; i < length; i++)
            string.append(characters.charAt(random.nextInt(characters.length())));

        return string.toString();
    }
}
