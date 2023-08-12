package me.dynomake.generator;

import lombok.NonNull;
import me.dynomake.generator.proxy.RandomStringsPatternProxy;

public interface RandomStringsPattern {

    static RandomStringsPattern create() {
        return new RandomStringsPatternProxy("");
    }

    static RandomStringsPattern create(@NonNull String characters ) {
        return new RandomStringsPatternProxy(characters);
    }

    RandomStringsPattern letters();
    RandomStringsPattern capitalLetters();
    RandomStringsPattern numbers();
    RandomStringsPattern spaces();
    RandomStringsPattern symbols();

    String next(int length);
}
