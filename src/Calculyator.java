import java.util.Scanner;

public class Calculyator {


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите математический пример из двух целых(арабских или римских)" +
                " чисел через пробел(a + b):");
        String[] lineInt;
        String[] lineString;


        if (sc.hasNextInt()) {
            lineInt = sc.nextLine().split(" ");
            if (lineInt.length < 3) {
                throw new Exception("//т.к. строка не является математической операцией");
            }
            if (lineInt.length > 3) {
                throw new Exception("//т.к. формат математической операции не удовлетворяет заданию -" +
                        " два операнда и один оператор (+, -, /, *)");
            }
            Arabic.getArabic(lineInt[0], lineInt[2], lineInt[1]);
            System.exit(1);
        } else {
            lineString = sc.nextLine().split(" ");
            if (lineString.length < 3) {
                throw new Exception("//т.к. строка не является математической операцией");
            }
            if (lineString.length > 3) {
                throw new Exception("//т.к. формат математической операции не удовлетворяет заданию -" +
                        " два операнда и один оператор (+, -, /, *)");
            }
            Rim.getRim(lineString[0], lineString[2], lineString[1]);
            System.exit(1);
        }

    }
}

