public class Array {
    public static char alphabet(char letter, int number, int key) {
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
            return numberAlphabet + key > 32 ? arrayAlphabet[numberAlphabet + key - 33] : arrayAlphabet[numberAlphabet + key];
        } else {
            return numberAlphabet - key < 0 ? arrayAlphabet[numberAlphabet - key + 33] : arrayAlphabet[numberAlphabet - key];
        }
    }
}