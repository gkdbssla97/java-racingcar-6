package racingcar.util.validate;

import static racingcar.util.constant.ExceptionConstant.*;

public class InputValidate {

    static public void validateNameFormat(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException(EMPTY_NAME);
        }
    }

    static public int validateInputNumberFormat(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(INPUT_VALID_NUMBER);
        }
    }

    static public void validateInputNumberRange(int number) {
        if (number < MINIMUM_NUMBER_VALUE) {
            throw new IllegalArgumentException(INPUT_VALID_NUMBER_RANGE);
        }
    }

    static public void validateNumberLength(String name) {
        if (name.length() > MINIMUM_NAME_LENGTH) {
            throw new IllegalArgumentException(INPUT_VALID_NAME_LENGTH);
        }
    }

    static public String validatePrintWinners(String winnerList) {
        if (!winnerList.contains(", ")) {
            throw new IllegalArgumentException("우승자가 2명 이상일 경우 출력은 ', '로 구분해야합니다.");
        }
        return winnerList;
    }
}
