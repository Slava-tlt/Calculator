public class Rim {
    public static int a;
    public static int b;
    public static int result;

    public static String[] arrayArabic = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static String[] arrayRoman = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI",
            "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV",
            "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII",
            "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV",
            "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI",
            "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII",
            "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};


    public static void getRim(String rimNumderOne, String rimNumberTwo, String operation) throws Exception {

        for (int i = 0; i < arrayArabic.length; i++) {       // проверяем второе число для исключения
            if (rimNumberTwo.equals(arrayArabic[i])) {
                throw new Exception("//т.к. используются одновременно разные системы счисления");
            }
        }


        for (int i = 0; i < arrayRoman.length; i++) {        // переводим первую римскую цифру в арабскую
            if (rimNumderOne.equals(arrayRoman[i])) {
                a = i + 1;
                break;
            }
        }

        for (int i = 0; i < arrayRoman.length; i++) {        // переводим вторую римскую цифру в арабскую
            if (rimNumberTwo.equals(arrayRoman[i])) {
                b = i + 1;
                break;
            }
        }

        if (a < 1 || a > 10) {
            throw new Exception("// т.к.  калькулятор принимает значения от I до X");
        }

        if (b < 1 || b > 10) {
            throw new Exception("// т.к.  калькулятор принимает значения от I до X");
        }

        switch (operation) {
            case "+":
                result = (a + b);
                break;
            case "-":
                result = (a - b);
                break;
            case "/":
                result = (a / b);
                break;
            case "*":
                result = (a * b);
                break;
            default:
                throw new Exception("//т.к. формат математического действия неверен (+, -, /, *)");
        }

        if (result < 1) {
            throw new Exception("//т.к. в римской системе нет отрицательных чисел");
        }

        System.out.println(arrayRoman[result - 1]);     // переводим результат с арабской цифры обратно в римскую

    }
}

