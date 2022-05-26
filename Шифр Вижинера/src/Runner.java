import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст!");
        String text = sc.nextLine();
        System.out.println("Введите ключ");
        String key = sc.next().toUpperCase();
        //Если требуется вывести и проверить строку без пробелов, то заменяем 9 строчку на 11 и убираем 26-29
        //text = text.replaceAll("\\s","").toUpperCase();
        char[] arrayKey = key.toCharArray();
        int[] keyNumber = new int[arrayKey.length];
        Array.transferKey(arrayKey, keyNumber);
        text = text.toUpperCase();
        char[] arrayText = text.toCharArray();
        System.out.println("Шифрование - (1)\nРасшифрование - (2)");
        int procedures = sc.nextInt();
        if (procedures != 1 && procedures != 2) {
            System.out.println("Неправильный ввод!");
            System.exit(0);
        }
        char[] newArray = new char[arrayText.length];
        int j = 0;
        for (int i = 0; i < arrayText.length; i++) {
            if (arrayText[i] == ' ') {
                newArray[i] = ' ';
                continue;
            }
            if (j > keyNumber.length - 1) {
                j = 0;
            }
            newArray[i] = Array.alphabet(arrayText[i], procedures, keyNumber[j]);
            j++;
        }
        String str = new String(newArray).toLowerCase();
        System.out.println(str);
    }
}