////////////////////////////////////////////////////////////////////
// [NOME1] [COGNOME1] [MATRICOLA1]
// [NOME2] [COGNOME2] [MATRICOLA2]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanPrinterTest {

    @Test
    public void testPrint_1_shouldReturnIAsciiArt() {
        // Arrange
        int input = 1;
        // ASCII art effettivo per "I"
        String expected =
            " _____ \n" +
            "|_   _|\n" +
            "  | |  \n" +
            "  | |  \n" +
            " _| |_ \n" +
            "|_____|";

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertEquals(expected.trim(), result.trim()); // Usiamo trim() su entrambi per sicurezza
    }

    @Test
    public void testPrint_2_shouldReturnIIAsciiArt() {
        // Arrange
        int input = 2;
        // Combinazione dell'ASCII art per "II"
        String expected =
            " _____  _____ \n" +
            "|_   _||_   _|\n" +
            "  | |    | |  \n" +
            "  | |    | |  \n" +
            " _| |_  _| |_ \n" +
            "|_____||_____|";

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertEquals(expected.trim(), result.trim()); // Usiamo trim() su entrambi per sicurezza
    }

    @Test
    public void testPrint_3_shouldReturnIIIAsciiArt() {
        // Arrange
        int input = 3;
        // Combinazione dell'ASCII art per "III"
        String expected =
            " _____  _____  _____ \n" +
            "|_   _||_   _||_   _|\n" +
            "  | |    | |    | |  \n" +
            "  | |    | |    | |  \n" +
            " _| |_  _| |_  _| |_ \n" +
            "|_____||_____||_____|";

        // Act
        String result = RomanPrinter.print(input);

        // Assert
        assertEquals(expected.trim(), result.trim()); // Usiamo trim() su entrambi per sicurezza
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrint_0_shouldThrowException() {
        // Arrange
        int input = 0;

        // Act
        RomanPrinter.print(input);

        // Assert: ci aspettiamo un'eccezione
        // Non è necessario, poiché l'eccezione viene gestita dall'annotazione @Test
    }

     @Test(expected = IllegalArgumentException.class)
    public void testPrint_GreaterThan1000_shouldThrowException() {
        // Arrange
        int input = 1001;

        // Act
        RomanPrinter.print(input);

        // Assert: ci aspettiamo un'eccezione
        // Non è necessario, poiché l'eccezione viene gestita dall'annotazione @Test
    }

     @Test(expected = IllegalArgumentException.class)
    public void testPrint_LessThan1_shouldThrowException() {
        // Arrange
        int input = -5;

        // Act
        RomanPrinter.print(input);

        // Assert: ci aspettiamo un'eccezione
        // Non è necessario, poiché l'eccezione viene gestita dall'annotazione @Test

    }
}