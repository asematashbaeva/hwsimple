import java.util.Scanner;
public class gradetrack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double assignmentPoints = 0;
        double examPoints = 0;
        int assignmentCount = 0;
        int examCount = 0;
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n===== SEMESTER GRADE TRACKER =====");
            System.out.println("1. Add assignment result");
            System.out.println("2. Add exam result");
            System.out.println("3. View current grade");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter assignment score: ");
                double score = input.nextDouble();

                if (score < 0 || score > 100) {
                    System.out.println(
                            "Invalid score. Enter a value from 0 to 100."
                    );
                } else {
                    assignmentPoints += score;
                    assignmentCount++;
                    System.out.println("Assignment score added.");
                }

            } else if (choice == 2) {
                System.out.print("Enter exam score: ");
                double score = input.nextDouble();

                if (score < 0 || score > 100) {
                    System.out.println(
                            "Invalid score. Enter a value from 0 to 100."
                    );
                } else {
                    examPoints += score;
                    examCount++;
                    System.out.println("Exam score added.");
                }

            } else if (choice == 3) {
                if (assignmentCount == 0 && examCount == 0) {
                    System.out.println("No results available yet.");
                } else {
                    double assignmentAverage = 0;
                    double examAverage = 0;
                    double overallAverage;

                    if (assignmentCount > 0) {
                        assignmentAverage =
                                assignmentPoints / assignmentCount;
                    }

                    if (examCount > 0) {
                        examAverage = examPoints / examCount;
                    }

                    System.out.println("\n===== CURRENT RESULTS =====");
                    System.out.println(
                            "Assignments completed: " + assignmentCount
                    );

                    if (assignmentCount > 0) {
                        System.out.println(
                                "Assignment average: " + assignmentAverage
                        );
                    } else {
                        System.out.println("No assignment results yet.");
                    }

                    System.out.println("Exams completed: " + examCount);

                    if (examCount > 0) {
                        System.out.println("Exam average: " + examAverage);
                    } else {
                        System.out.println("No exam results yet.");
                    }

                    if (assignmentCount > 0 && examCount > 0) {
                        overallAverage =
                                assignmentAverage * 0.50
                                        + examAverage * 0.50;
                    } else if (assignmentCount > 0) {
                        overallAverage = assignmentAverage;
                        System.out.println(
                                "Overall average uses assignment results only."
                        );
                    } else {
                        overallAverage = examAverage;
                        System.out.println(
                                "Overall average uses exam results only."
                        );
                    }

                    System.out.println("Overall average: " + overallAverage);

                    if (overallAverage >= 90) {
                        System.out.println("Grade: A");
                    } else if (overallAverage >= 80) {
                        System.out.println("Grade: B");
                    } else if (overallAverage >= 70) {
                        System.out.println("Grade: C");
                    } else if (overallAverage >= 60) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Grade: F");
                    }

                    if (overallAverage >= 60) {
                        System.out.println("Status: Passing");
                    } else {
                        System.out.println("Status: Failing");
                    }
                }

            } else if (choice == 4) {
                System.out.println("Grade tracker closed. Goodbye!");

            } else {
                System.out.println("Invalid option. Choose from 1 to 4.");
            }
        }

    }
}
