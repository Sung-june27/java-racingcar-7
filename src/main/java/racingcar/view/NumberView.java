package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class NumberView {
    public String input() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = Console.readLine();
        Console.close();

        return input;
    }
}
