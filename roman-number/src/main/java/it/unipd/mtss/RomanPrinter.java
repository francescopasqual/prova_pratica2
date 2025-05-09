////////////////////////////////////////////////////////////////////
// [NOME1] [COGNOME1] [MATRICOLA1]
// [NOME2] [COGNOME2] [MATRICOLA2]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;

public class RomanPrinter {
    private static final Map<Character, String[]> ROMAN_NUMERALS_ASCII = new HashMap<>();

    static {
        ROMAN_NUMERALS_ASCII.put('I', new String[] {
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|"
        });

        ROMAN_NUMERALS_ASCII.put('V', new String[] {
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    "
        });

        ROMAN_NUMERALS_ASCII.put('X', new String[] {
            "__   __",
            "\\ \\ / /",
            " \\ V / ",
            "  > <  ",
            " / . \\ ",
            "/_/ \\_\\"
        });

        ROMAN_NUMERALS_ASCII.put('L', new String[] {
            " _      ",
            "| |     ",
            "| |     ",
            "| |     ",
            "| |_____",
            "|_______|"
        });

        ROMAN_NUMERALS_ASCII.put('C', new String[] {
            "  _____ ",
            " / ____|",
            "| |     ",
            "| |     ",
            "| |____ ",
            " \\_____|"
        });

        ROMAN_NUMERALS_ASCII.put('D', new String[] {
            " _____  ",
            "|  __ \\ ",
            "| |  | |",
            "| |  | |",
            "| |__| |",
            "|_____/ "
        });

        ROMAN_NUMERALS_ASCII.put('M', new String[] {
            " __  __ ",
            "|  \\/  |",
            "| \\  / |",
            "| |\\/| |",
            "| |  | |",
            "|_|  |_|"
        });
    }

    public static String print(int num) {
        String romanNumber = IntegerToRoman.convert(num);
        return printAsciiArt(romanNumber);
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

        int height = ROMAN_NUMERALS_ASCII.get('I').length;
        StringBuilder[] resultRows = new StringBuilder[height];

        for (int i = 0; i < height; i++) {
            resultRows[i] = new StringBuilder();
        }

        for (char c : romanNumber.toCharArray()) {
            if (!ROMAN_NUMERALS_ASCII.containsKey(c)) {
                throw new IllegalArgumentException("Invalid Roman numeral character for ASCII art: " + c);
            }

            String[] asciiArt = ROMAN_NUMERALS_ASCII.get(c);

            for (int i = 0; i < height; i++) {
                resultRows[i].append(asciiArt[i]);
            }
        }

        StringBuilder finalResult = new StringBuilder();
        for (int i = 0; i < height; i++) {
            finalResult.append(resultRows[i]);
            if (i < height - 1) { 
                finalResult.append("\n");
            }
        }
        return finalResult.toString().trim();
    }
}