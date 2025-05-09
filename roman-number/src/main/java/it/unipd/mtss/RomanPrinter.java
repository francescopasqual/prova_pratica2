////////////////////////////////////////////////////////////////////
// FRANCESCO PASQUAL 2103119
// MARCO PIRO 2068075
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;


public class RomanPrinter {
    private static final Map<Character, String[]> 
        ROMAN_NUMERALS_ASCII = new HashMap<>();

    static {
        // Inizializzazione ASCII Art per I (linee lunghe)
        ROMAN_NUMERALS_ASCII.put('I', new String[] {
            " _____ ",
            "|_   _|",
            "  | |  ",
            "  | |  ",
            " _| |_ ",
            "|_____|"
        });

        // Inizializzazione ASCII Art per V (linee lunghe)
        ROMAN_NUMERALS_ASCII.put('V', new String[] {
            "__      __",
            "\\ \\    / /",
            " \\ \\  / / ",
            "  \\ \\/ /  ",
            "   \\  /   ",
            "    \\/    "
        });

        // Inizializzazione ASCII Art per X (linee lunghe)
        ROMAN_NUMERALS_ASCII.put('X', new String[] {
            "__   __",
            "\\ \\ / /",
            " \\ V / ",
            "  > <  ",
            " / . \\ ",
            "/_/ \\_\\"
        });

        // Inizializzazione ASCII Art per L (linee lunghe)
        ROMAN_NUMERALS_ASCII.put('L', new String[] {
            " _      ",
            "| |     ",
            "| |     ",
            "| |     ",
            "| |_____", // Questa riga potrebbe essere al limite
            "|_______|"
        });

        // Inizializzazione ASCII Art per C (linee lunghe)
        ROMAN_NUMERALS_ASCII.put('C', new String[] {
            "  _____ ",
            " / ____|",
            "| |     ",
            "| |     ",
            "| |____ ",
            " \\_____|"
        });

        // Inizializzazione ASCII Art per D (linee lunghe)
        ROMAN_NUMERALS_ASCII.put('D', new String[] {
            " _____  ",
            "|  __ \\ ",
            "| |  | |",
            "| |  | |",
            "| |__| |",
            "|_____/ "
        });

        // Inizializzazione ASCII Art per M (linee lunghe)
        ROMAN_NUMERALS_ASCII.put('M', new String[] {
            " __  __ ",
            "|  \\/  |",
            "| \\  / |",
            "| |\\/| |",
            "| |  | |",
            "|_|  |_|"
        });
    }

    public static String print(final int num) {
        // Utilizza la classe IntegerToRoman per la conversione
        String romanNumber = IntegerToRoman.convert(num);
        return printAsciiArt(romanNumber);
    }

   
    private static String printAsciiArt(final String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            return "";
        }

       
        int height = ROMAN_NUMERALS_ASCII.get('I').length;
        StringBuilder[] resultRows = new StringBuilder[height];

        // Inizializza ogni StringBuilder nell'array
        for (int i = 0; i < height; i++) {
            resultRows[i] = new StringBuilder();
        }

        // Itera su ogni carattere del numero romano
        for (char c : romanNumber.toCharArray()) {
            if (!ROMAN_NUMERALS_ASCII.containsKey(c)) {
                throw new IllegalArgumentException(
                    "Invalid Roman numeral character for ASCII art: " + c);
            }

            // Ottieni l'ASCII art per il carattere corrente
            String[] asciiArt = ROMAN_NUMERALS_ASCII.get(c);

            for (int i = 0; i < height; i++) {
                resultRows[i].append(asciiArt[i]);
            }
        }

        // Costruisci la stringa finale aggiungendo i newline tra le righe
        StringBuilder finalResult = new StringBuilder();
        for (int i = 0; i < height; i++) {
            finalResult.append(resultRows[i]);
            if (i < height - 1) { // Evita di aggiungere un newline alla fine
                finalResult.append("\n");
            }
        }

        return finalResult.toString().trim();
    }
}
