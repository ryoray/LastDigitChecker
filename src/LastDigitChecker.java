public class LastDigitChecker {

    public static boolean hasSameLastDigit (int firstNum, int secondNum, int thirdNum) {
        if ((firstNum < 10 || firstNum > 1000) || (secondNum < 10 || secondNum > 1000) ||
                (thirdNum < 10 || thirdNum > 1000)) {
            return false;
        }

        int lastOfFirstNum = firstNum % 10;
        int lastOfSecondNum = secondNum % 10;
        int lastOfThirdNum = thirdNum % 10;

        return lastOfFirstNum == lastOfSecondNum || lastOfFirstNum == lastOfThirdNum || lastOfSecondNum == lastOfThirdNum;
    }

    public static boolean isValid (int number) {
        return number >= 10 && number <= 1000;
    }
}
