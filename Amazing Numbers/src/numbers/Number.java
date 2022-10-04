package numbers;

import java.util.HashSet;
import java.util.List;

class Number {

    private long firstNumber;

    Number(long firstNumber) {
        this.firstNumber = firstNumber;
    }

    private boolean isGapfulNumber() {
        String stringNumber = String.valueOf(firstNumber);
        String[] arrayOfDigits = stringNumber.split("");
        if (arrayOfDigits.length < 3) {
            return false;
        }
        String stringDivisor = arrayOfDigits[0].concat(arrayOfDigits[arrayOfDigits.length - 1]);
        long divisor = Long.parseLong(stringDivisor);
        return firstNumber % divisor == 0;
    }

    private boolean isBuzzNumber() {
        return endsWith7() || isDivisibleBy7();
    }

    private boolean isEvenNumber() {
        return firstNumber % 2 == 0;
    }

    private boolean isDivisibleBy7() {
        return firstNumber % 7 == 0;
    }

    private boolean endsWith7() {
        return firstNumber % 10 == 7;
    }

    private boolean isDuckNumber() {
        String number = Long.toString(firstNumber);
        for (int i = 1; i < number.length(); i++) {
            if (number.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }

    private boolean isPalindromeNumber() {
        long reverseNum = 0;
        long tempOriginal = firstNumber;

        while (tempOriginal > 0) {
            long lastDigit = tempOriginal % 10;
            reverseNum = reverseNum * 10 + lastDigit;
            tempOriginal = tempOriginal / 10;
        }
        return firstNumber == reverseNum;
    }

    private boolean isSpyNumber() {
        String number = String.valueOf(firstNumber);
        if (number.length() == 1) {
            return true;
        }
        String[] arrayOfDigits = number.split("");
        long sum = 0;
        long product = 1;
        for (String arrayOfDigit : arrayOfDigits) {
            sum += Long.parseLong(arrayOfDigit);
        }
        for (String arrayOfDigit : arrayOfDigits) {
            product *= Long.parseLong(arrayOfDigit);
        }
        return sum == product;
    }

    private boolean isPerfectSquareNumber(double number) {
        return ((Math.sqrt(number) - Math.floor((Math.sqrt(number))) == 0));
    }

    private boolean isSunnyNumber() {
        return isPerfectSquareNumber(firstNumber + 1);
    }

    private boolean isJumpingNumber() {
        String number = String.valueOf(firstNumber);
        String[] arrayOfDigits = number.split("");
        for (int i = 1; i < arrayOfDigits.length; i++) {
            if (Math.abs(Long.parseLong(arrayOfDigits[i]) - Long.parseLong(arrayOfDigits[i - 1])) != 1) {
                return false;
            }
        }
        return true;
    }

    private boolean isHappyNumber() {
        if (firstNumber == 1 || firstNumber == 7) {
            return true;
        }
        long sum = firstNumber, x = firstNumber;
        while (sum > 9) {
            sum = 0;
            while (x > 0) {
                long d = x % 10;
                sum += d * d;
                x /= 10;
            }
            x = sum;
        }

        return sum == 7 || sum == 1;
    }

    void findNumbersByProperties(List<String> properties, List<String> oppositeProperties, int occurrences) {
        System.out.println();
        properties.replaceAll(String::toLowerCase);
        while (occurrences != 0) {
            if (!new HashSet<>(getListOfNumberProperties()).containsAll(properties) || haveNumberAnyOppositeProperty(oppositeProperties)) {
                ++this.firstNumber;
                continue;
            }
            printNumberProperties();
            ++this.firstNumber;
            --occurrences;
        }
        System.out.println();
    }

    private boolean haveNumberAnyOppositeProperty(List<String> oppositeProperties) {
        for (String property : getListOfNumberProperties()) {
            for (String oppositeProperty : oppositeProperties) {
                if (property.equalsIgnoreCase(oppositeProperty)) {
                    return true;
                }
            }
        }
        return false;
    }

    void printNumbersProperties(int occurrences) {
        System.out.println();
        long lastNumber = firstNumber + occurrences;
        while (firstNumber < lastNumber) {
            printNumberProperties();
            ++this.firstNumber;
        }
        System.out.println();
    }

    private List<String> getListOfNumberProperties() {
        String buzzNumber = isBuzzNumber() ? "buzz" : "";
        String duckNumber = isDuckNumber() ? "duck" : "";
        String palindrome = isPalindromeNumber() ? "palindromic" : "";
        String gapfulNumber = isGapfulNumber() ? "gapful" : "";
        String spyNumber = isSpyNumber() ? "spy" : "";
        String perfectSquareNumber = isPerfectSquareNumber(firstNumber) ? "square" : "";
        String sunnyNumber = isSunnyNumber() ? "sunny" : "";
        String jumpingNumber = isJumpingNumber() ? "jumping" : "";
        String evenNumber = isEvenNumber() ? "even" : "";
        String oddNumber = !isEvenNumber() ? "odd" : "";
        String happyNumber = isHappyNumber() ? "happy" : "";
        String sadNumber = !isHappyNumber() ? "sad" : "";
        return List.of(buzzNumber, duckNumber, palindrome, gapfulNumber, spyNumber, perfectSquareNumber, sunnyNumber, jumpingNumber, evenNumber, oddNumber, happyNumber, sadNumber);
    }

    private void printNumberProperties() {
        StringBuilder properties = new StringBuilder();
        for (String property : getListOfNumberProperties()) {
            properties.append(property);
            if (!property.equals("")) {
                properties.append(", ");
            }
        }
        properties.replace(properties.length() - 2, properties.length(), "");
        System.out.println("             " + firstNumber + " is " + properties);
    }

    void printSingleNumberProperties() {
        System.out.println("\nProperties of " + firstNumber + "\n" +
                "        buzz: " + isBuzzNumber() + "\n" +
                "        duck: " + isDuckNumber() + "\n" +
                " palindromic: " + isPalindromeNumber() + "\n" +
                "      gapful: " + isGapfulNumber() + "\n" +
                "         spy: " + isSpyNumber() + "\n" +
                "      square: " + isPerfectSquareNumber(firstNumber) + "\n" +
                "       sunny: " + isSunnyNumber() + "\n" +
                "     jumping: " + isJumpingNumber() + "\n" +
                "        even: " + isEvenNumber() + "\n" +
                "         odd: " + !isEvenNumber() + "\n" +
                "       happy: " + isHappyNumber() + "\n" +
                "         sad: " + !isHappyNumber() + "\n");
    }
}