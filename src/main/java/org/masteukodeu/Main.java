package org.masteukodeu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many features does your project have?");
        int projectSize = scanner.nextInt();
        System.out.println("How many features does one developer create in a week?");
        int developerVelocity = scanner.nextInt();
        System.out.println("How many developers will work on this project full time?");
        int developers = scanner.nextInt();
        int numberOfPeopleToTalkTo = developers - 1;
        double amountOfTimeSpentTalkingToOthers = numberOfPeopleToTalkTo * 0.1;
        double developerVelocityIncludingCommunication = developerVelocity * (1 - amountOfTimeSpentTalkingToOthers);
        double time = ((double) projectSize) / (developers * developerVelocityIncludingCommunication);
        System.out.println("Your project will take " + time + " weeks");
    }
}