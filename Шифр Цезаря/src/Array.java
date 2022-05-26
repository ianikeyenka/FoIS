public class Array {
    public static char alphabet(char letter, int number) {
        String textAlphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        char[] arrayAlphabet = textAlphabet.toCharArray();
        int numberAlphabet = 0;
        for (int i = 0; i < arrayAlphabet.length; i++) {
            if (arrayAlphabet[i] == letter) {
                numberAlphabet = i;
                break;
            }
        }
        if (number == 1) {
            return numberAlphabet + 3 > 32 ? arrayAlphabet[numberAlphabet + 3 - 33] : arrayAlphabet[numberAlphabet + 3];
        } else {
            return numberAlphabet - 3 < 0 ? arrayAlphabet[numberAlphabet - 3 + 33] : arrayAlphabet[numberAlphabet - 3];
        }
    }
}