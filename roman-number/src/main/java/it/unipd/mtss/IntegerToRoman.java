////////////////////////////////////////////////////////////////////
// FRANCESCO PASQUAL 2103119
// MARCO PIRO 2068075
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {

    /**
     * Converte un numero intero in un numero romano.
     *
     * @param number 
     * @return La rappresentazione del numero in formato romano.
     * @throws IllegalArgumentException se l'input non è compreso tra 1 e 1000.
     */
    public static String convert(final int number) {
        if (number <= 0 || number > 1000) {
            // Spezziamo la riga per rispettare il limite di 80 caratteri
            throw new IllegalArgumentException(
                "Number must be between 1 and 1000");
        }

        String[] thousands = {"", "M"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", 
        "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", 
        "LX", "LXX", "LXXX", "XC"};
        String[] ones = {"", "I", "II", "III", "IV", "V", 
        "VI", "VII", "VIII", "IX"};

        return thousands[number / 1000] +
               hundreds[(number % 1000) / 100] +
               tens[(number % 100) / 10] +
               ones[number % 10];
    }
}