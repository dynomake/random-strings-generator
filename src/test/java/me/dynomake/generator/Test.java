package me.dynomake.generator;

public class Test {
    public static void main(String[] args) {
        System.out.println("only small letters: " + RandomStringsPattern.create()
                .letters()
                .next(16));
        System.out.println("only capital letters: " + RandomStringsPattern.create()
                .capitalLetters()
                .next(16));
        System.out.println("only capital letters & numbers: " + RandomStringsPattern.create()
                .numbers()
                .capitalLetters()
                .next(16));

        System.out.println("really big & strong pass: " + RandomStringsPattern.create()
                .numbers()
                .capitalLetters()
                .letters()
                .symbols()
                .next(30));
    }
}
