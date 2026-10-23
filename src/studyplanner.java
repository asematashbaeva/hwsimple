import java.util.Scanner;

        public class studyplanner {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                int weeklyGoal = 600;
                int programming = 0;
                int mathematics = 0;
                int english = 0;
                int other = 0;
                int totalTime = 0;
                int sessions = 0;
                int choice = 0;

                while (choice != 4) {
                    System.out.println("\n===== STUDY TRACKER =====");
                    System.out.println("1. Add study session");
                    System.out.println("2. View statistics");
                    System.out.println("3. Check weekly goal");
                    System.out.println("4. Exit");
                    System.out.print("Choose an option: ");

                    choice = input.nextInt();

                    if (choice == 1) {
                        System.out.println("\nChoose subject:");
                        System.out.println("1. Programming");
                        System.out.println("2. Mathematics");
                        System.out.println("3. English");
                        System.out.println("4. Other");
                        System.out.print("Choose an option: ");

                        int subject = input.nextInt();

                        if (subject < 1 || subject > 4) {
                            System.out.println("Invalid subject choice.");
                            continue;
                        }

                        System.out.print("Study time in minutes: ");
                        int minutes = input.nextInt();

                        if (minutes <= 0) {
                            System.out.println(
                                    "Invalid study time. Time must be greater than 0."
                            );
                            continue;
                        }

                        if (subject == 1) {
                            programming += minutes;
                        } else if (subject == 2) {
                            mathematics += minutes;
                        } else if (subject == 3) {
                            english += minutes;
                        } else {
                            other += minutes;
                        }

                        totalTime += minutes;
                        sessions++;

                        System.out.println("Study session added!");
                        System.out.println(
                                "Current total study time: " + totalTime + " minutes"
                        );

                    } else if (choice == 2) {
                        System.out.println("\n===== WEEKLY STATISTICS =====");
                        System.out.println("Study sessions: " + sessions);
                        System.out.println("Total study time: " + totalTime + " minutes");
                        System.out.println();
                        System.out.println("Programming: " + programming + " minutes");
                        System.out.println("Mathematics: " + mathematics + " minutes");
                        System.out.println("English: " + english + " minutes");
                        System.out.println("Other: " + other + " minutes");

                    } else if (choice == 3) {
                        System.out.println("\nWeekly goal: " + weeklyGoal + " minutes");
                        System.out.println("You studied: " + totalTime + " minutes");

                        if (totalTime >= weeklyGoal) {
                            System.out.println("Weekly goal achieved!");
                        } else {
                            System.out.println(
                                    "Remaining: " + (weeklyGoal - totalTime) + " minutes"
                            );
                        }

                    } else if (choice == 4) {
                        System.out.println(
                                "Study tracker closed. Keep up the good work!"
                        );

                    } else {
                        System.out.println("Invalid option. Choose from 1 to 4.");
                    }
                }

            }
        }

