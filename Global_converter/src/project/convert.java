package project;

public class convert {

    public static void main(String[] args) {

    }
    public static int CharToDecimal(char character){
        return character;
    }

    public static void TextToDecim(String chaine) {

        StringBuilder concatenatedValues = new StringBuilder();

        if (chaine.length() > 0) {
            for (int i = 0; i < chaine.length(); i++) {
                char c = chaine.charAt(i);
                concatenatedValues.append(CharToDecimal(c));
            }
            System.out.println(concatenatedValues.toString());
        } else {
            System.out.println("Aucun argument fourni ou l'argument est vide.");
        }
    }

    public static String DecimalTotext(String decimalAscii) {
        StringBuilder convertedText = new StringBuilder();

        int asciiValue = 0;
        int digitCount = 0;

        for (int i = decimalAscii.length() - 1; i >= 0; i--) {
            int digit = decimalAscii.charAt(i) - '0';
            int power = (int) Math.pow(10, digitCount);

            asciiValue += digit * power;
            digitCount++;

            if (digitCount == 3 || i == 0) {
                char character = (char) asciiValue;
                convertedText.insert(0, character);
                asciiValue = 0;
                digitCount = 0;
            }
        }

        return convertedText.toString();
    }

    public static String convertirEnHexadecimal(String texte) {
        StringBuilder constructeurHex = new StringBuilder();

        for (int i = 0; i < texte.length(); i++) {
            char c = texte.charAt(i);

            StringBuilder constructeurHexCaractere = new StringBuilder();

            int valeurAscii = (int) c;
            while (valeurAscii > 0) {
                int reste = valeurAscii % 16;
                char chiffreHex = obtenirChiffreHex(reste);
                constructeurHexCaractere.insert(0, chiffreHex);
                valeurAscii /= 16;
            }

            constructeurHex.append(constructeurHexCaractere);
        }

        return constructeurHex.toString();
    }

    public static char obtenirChiffreHex(int valeur) {
        if (valeur >= 0 && valeur <= 9) {
            return (char) ('0' + valeur);
        } else {
            return (char) ('A' + (valeur - 10));
        }
    }

    public static String convertirEnOctalASCII(String texte) {
        StringBuilder constructeurOctal = new StringBuilder();

        for (int i = 0; i < texte.length(); i++) {
            char c = texte.charAt(i);

            StringBuilder constructeurOctalCaractere = new StringBuilder();

            int valeurAscii = (int) c;
            while (valeurAscii > 0) {
                int reste = valeurAscii % 8;
                char chiffreOctal = obtenirChiffreOctal(reste);
                constructeurOctalCaractere.insert(0, chiffreOctal);
                valeurAscii /= 8;
            }

            constructeurOctal.append(constructeurOctalCaractere);
        }

        return constructeurOctal.toString();
    }

    public static char obtenirChiffreOctal(int valeur) {
        return (char) ('0' + valeur);
    }

    public static String convertirEnBinaireASCII(String texte) {
        StringBuilder constructeurBinaire = new StringBuilder();

        for (int i = 0; i < texte.length(); i++) {
            char c = texte.charAt(i);

            StringBuilder constructeurBinaireCaractere = new StringBuilder();

            int valeurAscii = (int) c;
            while (valeurAscii > 0) {
                int bit = valeurAscii % 2;
                constructeurBinaireCaractere.insert(0, bit);
                valeurAscii /= 2;
            }

            while (constructeurBinaireCaractere.length() < 8) {
                constructeurBinaireCaractere.insert(0, '0');
            }

            constructeurBinaire.append(constructeurBinaireCaractere);
        }

        return constructeurBinaire.toString();
    }


}
