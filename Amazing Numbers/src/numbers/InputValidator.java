package numbers;

import java.util.*;

class InputValidator {

    private static final Scanner SCANNER = new Scanner(System.in);
    private String input;
    private String[] array0fInputData;
    private static final String[] allProperties = {"EVEN", "ODD", "BUZZ", "DUCK", "PALINDROMIC", "GAPFUL", "SPY", "SQUARE", "SUNNY", "JUMPING", "HAPPY", "SAD"};
    private static final String[][] mutuallyExclusiveProperties = {{"ODD", "EVEN"},
            {"DUCK", "SPY"},
            {"SQUARE", "SUNNY"},
            {"HAPPY", "SAD"}};
    private static final String[][] mutuallyExclusiveOppositeProperties = {{"-ODD", "-EVEN"},
            {"-HAPPY", "-SAD"}};

    private long getNumber() {
        return Long.parseLong(array0fInputData[0]);
    }

    private int getNumberOfDigits() {
        return Integer.parseInt(array0fInputData[1]);
    }

    private String[] getArray0fInputData() {
        return array0fInputData;
    }

    private void setArray0fInputData() {
        this.array0fInputData = input.split(" ");
    }

    private List<String> deleteDuplicates(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    private List<String> getProperties() {
        List<String> properties = new ArrayList<>();
        for (int i = 2; i < getArray0fInputData().length; i++) {
            if (!getArray0fInputData()[i].startsWith("-")) {
                properties.add(getArray0fInputData()[i]);
            }
        }
        return deleteDuplicates(properties);
    }

    private List<String> getOppositeProperties() {
        List<String> properties = new ArrayList<>();
        for (int i = 2; i < getArray0fInputData().length; i++) {
            if (getArray0fInputData()[i].startsWith("-")) {
                properties.add(getArray0fInputData()[i]);
            }
        }
        return deleteDuplicates(properties);
    }

    private List<String> getOppositePropertiesWithoutMinus() {
        List<String> properties = new ArrayList<>();
        for (int i = 2; i < getArray0fInputData().length; i++) {
            if (getArray0fInputData()[i].startsWith("-")) {
                properties.add(getArray0fInputData()[i].substring(1));
            }
        }
        return deleteDuplicates(properties);
    }

    private boolean isNumberFormat() {
        try {
            Long.parseLong(array0fInputData[0]);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private boolean isNotNaturalNumber(String number) {
        return Long.parseLong(number) < 0;
    }

    private boolean isEmptyRequest() {
        return input.trim().isEmpty();
    }

    private List<String> getIncorrectProperties(List<String> properties) {
        List<String> incorrectProperties = new ArrayList<>();
        for (String property : properties) {
            if (!Arrays.asList(allProperties).contains(property.replace("-", "").toUpperCase())) {
                incorrectProperties.add(property.toUpperCase());
            }
        }
        return incorrectProperties;
    }

    private boolean isNotCorrectProperty(List<String> properties) {
        return !getIncorrectProperties(properties).isEmpty();
    }

    private int findMutuallyExclusiveProperties(List<String> properties, String[][] mutuallyExclusiveProperties) {
        List<Integer> numberProperties = new ArrayList<>();
        int index = -1;
        for (String property : properties) {
            for (int i = 0; i < mutuallyExclusiveProperties.length; i++) {
                for (int j = 0; j < mutuallyExclusiveProperties[i].length; j++) {
                    if (Objects.equals(property.toUpperCase(), mutuallyExclusiveProperties[i][j])) {
                        numberProperties.add(i);
                    }
                }
            }
        }
        boolean isMutuallyExclusiveProperties = false;
        for (int i = 0; i < numberProperties.size() && !isMutuallyExclusiveProperties; i++) {
            for (int j = 0; j < numberProperties.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (Objects.equals(numberProperties.get(i), numberProperties.get(j))) {
                    index = numberProperties.get(i);
                    isMutuallyExclusiveProperties = true;
                    break;
                }
            }
        }
        return index;
    }

    private List<String> findMutuallyExclusiveProperties(List<String> properties, List<String> oppositeProperties) {
        List<String> list = new ArrayList<>();
        for (String property : properties) {
            for (String oppositeProperty : oppositeProperties) {
                if (property.equalsIgnoreCase(oppositeProperty.substring(1))) {
                    list.add(oppositeProperty.toUpperCase());
                    list.add(property.toUpperCase());
                }
            }
        }
        return list;
    }

    private boolean AreMutuallyExclusiveProperties(int mutuallyExclusivePairIndex) {
        return mutuallyExclusivePairIndex != -1;
    }

    private boolean AreMutuallyExclusiveProperties() {
        return !findMutuallyExclusiveProperties(getProperties(), getOppositeProperties()).isEmpty();
    }

    void enterRequest() {
        printFirstStatement();
        Number number;
        while (true) {
            System.out.print("Enter a request: ");
            input = SCANNER.nextLine();
            if (input.equals("0")) {
                break;
            } else if (isEmptyRequest()) {
                printSupportedRequests();
                continue;
            }
            setArray0fInputData();
            if (!isNumberFormat() || isNotNaturalNumber(array0fInputData[0])) {
                printFirstParameterErrorMessage();
                continue;
            } else if (array0fInputData.length == 2 && isNotNaturalNumber(array0fInputData[1])) {
                printSecondParameterErrorMessage();
                continue;
            } else if (array0fInputData.length >= 3) {
                if (isNotCorrectProperty(getProperties())) {
                    printIncorrectProperties(getIncorrectProperties(getProperties()));
                    printAvailableProperties();
                    continue;
                } else if (isNotCorrectProperty(getOppositeProperties())) {
                    printIncorrectProperties(getIncorrectProperties(getOppositeProperties()));
                    printAvailableProperties();
                    continue;
                } else if (AreMutuallyExclusiveProperties(findMutuallyExclusiveProperties(getProperties(), mutuallyExclusiveProperties))) {
                    printMutuallyExclusiveProperties(findMutuallyExclusiveProperties(getProperties(), mutuallyExclusiveProperties), mutuallyExclusiveProperties);
                    continue;
                } else if (AreMutuallyExclusiveProperties(findMutuallyExclusiveProperties(getOppositeProperties(), mutuallyExclusiveOppositeProperties))) {
                    printMutuallyExclusiveProperties(findMutuallyExclusiveProperties(getOppositeProperties(), mutuallyExclusiveOppositeProperties), mutuallyExclusiveOppositeProperties);
                    continue;
                } else if (AreMutuallyExclusiveProperties()) {
                    System.out.print("\nThe request contains mutually exclusive properties: ");
                    System.out.print(findMutuallyExclusiveProperties(getProperties(), getOppositeProperties()));
                    System.out.println("\nThere are no numbers with these properties.\n");
                    continue;
                }
            }
            switch (array0fInputData.length) {
                case 1 -> {
                    number = new Number(getNumber());
                    number.printSingleNumberProperties();
                }
                case 2 -> {
                    number = new Number(getNumber());
                    number.printNumbersProperties(getNumberOfDigits());
                }
                default -> {
                    number = new Number(getNumber());
                    number.findNumbersByProperties(getProperties(), getOppositePropertiesWithoutMinus(), getNumberOfDigits());
                }
            }
        }
        System.out.println("\nGoodbye!");
    }

    private static void printIncorrectProperties(List<String> incorrectProperties) {
        if (incorrectProperties.size() == 1) {
            System.out.println("\nThe property " + incorrectProperties + " is wrong.");
        } else {
            System.out.print("\nThe properties " + incorrectProperties + " are wrong.\n");
        }
    }

    private static void printMutuallyExclusiveProperties(int mutuallyExclusivePairIndex, String[][] mutuallyExclusiveProperties) {
        final int rows = mutuallyExclusiveProperties[0].length;
        System.out.print("\nThe request contains mutually exclusive properties: ");
        System.out.print("[");
        for (int i = 0; i < rows; i++) {
            System.out.print(mutuallyExclusiveProperties[mutuallyExclusivePairIndex][i].toUpperCase());
            if (i < mutuallyExclusiveProperties[i].length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
        System.out.println("There are no numbers with these properties.\n");
    }

    private static void printFirstParameterErrorMessage() {
        System.out.println("\nThe first parameter should be a natural number or zero.\n");
    }

    private static void printSecondParameterErrorMessage() {
        System.out.println("\nThe second parameter should be a natural number.\n");
    }

    private static void printAvailableProperties() {
        System.out.println("Available properties: " + Arrays.toString(allProperties) + "\n");
    }

    static void printFirstStatement() {
        System.out.print("Welcome to Amazing Numbers!\n");
        printSupportedRequests();
    }

    private static void printSupportedRequests() {
        System.out.print("""

                Supported requests:
                - enter a natural number to know its properties;
                - enter two natural numbers to obtain the properties of the list:
                  * the first parameter represents a starting number;
                  * the second parameter shows how many consecutive numbers are to be printed;
                - two natural numbers and properties to search for;
                - a property preceded by minus must not be present in numbers;
                - separate the parameters with one space;
                - enter 0 to exit.

                """);
    }
}