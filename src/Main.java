import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number;

        final char[] digits = {
                '0', '1', '2', '3', '4', '5',
                '6', '7', '8', '9', 'a', 'b',
                'c', 'd', 'e', 'f'};
        ArrayList<Character> resultToHex = new ArrayList<>();
        ArrayList<Character> resultToBi = new ArrayList<>();
        int a = 0;
        do {

            System.out.println("Выбирите желаемый пункт меню");
            System.out.println("1. Встроенная функция перевода в 16-ую систему");
            System.out.println("2. Встроенная функция перевода в 2-ую систему");
            System.out.println("3. Собственная реализация перевода в Шестнадцатиричную систему");
            System.out.println("4. Собственная реализация перевода в Двоичную систему");
            System.out.println("0. Выход");
            a = Integer.parseInt(reader.readLine());

            switch (a) {
                case 1: {
                    System.out.println("Введите число от 0 до 10000");
                    number = Integer.parseInt(reader.readLine());
                    String convertToHex = Integer.toHexString(number);
                    System.out.println("Шестнадцатиричная система");
                    System.out.println(convertToHex);
                    break;
                }
                case 2: {
                    System.out.println("Введите число от 0 до 10000");
                    number = Integer.parseInt(reader.readLine());
                    String convertToBi = Integer.toBinaryString(number);
                    System.out.println("Двоичная система");
                    System.out.println(convertToBi);
                    break;
                }
                case 3: {
                    resultToHex.clear();
                    System.out.println("Введите число от 0 до 10000");
                    number = Integer.parseInt(reader.readLine());
                    while (number != 0) {
                        resultToHex.add(digits[(char) number % 16]);
                        number = number / 16;
                    }
                    for (int i = resultToHex.size() - 1; i >= 0; i--) {
                        System.out.print(resultToHex.get(i));
                    }
                    System.out.println();
                    break;
                }
                case 4: {
                    resultToBi.clear();
                    System.out.println("Введите число от 0 до 10000");
                    number = Integer.parseInt(reader.readLine());
                    while (number != 0) {
                        resultToBi.add(digits[(char) number % 2]);
                        number = number / 2;
                    }
                    for (int i = resultToBi.size() - 1; i >= 0; i--) {
                        System.out.print(resultToBi.get(i));
                    }
                    System.out.println();
                    break;
                }
            }
        } while (a!=0);

        System.out.println("Перевод из двоичной в десятичную");
        System.out.println("Введите двоичной число");
        String numberBi = reader.readLine();
        int result = 0;
        for(int i =0 ; i<numberBi.length() ;i++){
            if (numberBi.charAt(numberBi.length()-i-1) == '1') {
                result += (int) Math.pow(2, i);
            }
        }
        System.out.println(numberBi + "->" + result);

    }
}
