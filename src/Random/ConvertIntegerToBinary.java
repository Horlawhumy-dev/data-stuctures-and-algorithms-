package Random;

public class ConvertIntegerToBinary {
    public ConvertIntegerToBinary() {
    }

    public static int findNumberOfZeroInBinary(int number) {
        int count = 0;
        if (number <= 0) {
            return 1;
        } else {
            String[] binary = convertIntegerToBinary(number).split("");
            for (String s : binary) {
                if (s.equals("0")) {
                    ++count;
                }
            }

            return count;
        }
    }

    public static String convertIntegerToBinary(int number) {
        StringBuilder result = new StringBuilder();
        if (number <= 0) {
            return "";
        } else {
            while(number > 0) {
                number /= 2;
                result.append(number % 2);
            }

            return result.toString();
        }
    }
}
