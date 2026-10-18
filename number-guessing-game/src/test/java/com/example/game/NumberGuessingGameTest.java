package com.example.game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberGuessingGameTest {
    @Test
    void returnsTooLowWhenGuessIsLower() {
        assertEquals("Too low!", NumberGuessingGame.checkGuess(50, 20));
    }

    @Test
    void returnsTooHighWhenGuessIsHigher() {
        assertEquals("Too high!", NumberGuessingGame.checkGuess(50, 80));
    }

    @Test
    void returnsWinMessageWhenGuessIsCorrect() {
        assertEquals("Correct! You win!", NumberGuessingGame.checkGuess(50, 50));
    }
}
