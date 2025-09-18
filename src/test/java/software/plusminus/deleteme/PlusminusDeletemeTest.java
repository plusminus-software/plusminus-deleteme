package software.plusminus.repository;

import org.junit.jupiter.api.Test;

import static software.plusminus.check.Checks.check;

class PlusminusDeletemeTest {

    @Test
    void add() {
        int result = new PlusminusDeleteme().add(1, 2);
        check(result).is(3);
    }
}