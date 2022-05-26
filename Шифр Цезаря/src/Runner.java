import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст!");
        String text = sc.nextLine();
        text = text.toUpperCase();
        //Если требуется вывести и проверить строку без пробелов, то заменяем 8 строчку на 10 и убираем 20-23
        //text = text.replaceAll("\\s","").toUpperCase();
        char[] arrayText = text.toCharArray();
        System.out.println("Шифрование - (1)\nРасшифрование - (2)");
        int procedures = sc.nextInt();
        if (procedures != 1 && procedures != 2) {
            System.out.println("Неправильный ввод!");
            System.exit(0);
        }
        char[] newArray = new char[arrayText.length];
        for (int i = 0; i < arrayText.length; i++) {
            if (arrayText[i] == ' ') {
                newArray[i] = ' ';
                continue;
            }
            newArray[i] = Array.alphabet(arrayText[i], procedures);
        }
        String str = new String(newArray).toLowerCase();
        System.out.println(str);
    }
}