public class Arabic {

    public static int result;

    public static void getArabic(String arabicNumberOne, String arabicNumberTwo, String operation) throws Exception {

        int a = Integer.parseInt(arabicNumberOne);
        int b = 0;
        try {
            b = Integer.parseInt(arabicNumberTwo);               // проверяем второе число для исключения
        } catch (NumberFormatException e) {
            throw new Exception("//т.к. используются одновременно разные системы счисления");
        }


        if (a < 1 || a > 10) {
            throw new Exception("// т.к.  калькулятор принимает значения от 1 до 10");
        }

        if (b < 1 || b > 10) {
            throw new Exception("// т.к.  калькулятор принимает значения от 1 до 10");
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
        System.out.println(result);

    }

}
