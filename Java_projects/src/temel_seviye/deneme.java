package temel_seviye;

import java.util.Scanner;

public class deneme {
  public static void main(String[] args) {

    // initialize variables
    int total = 0; // sum of grades
    int gradeCounter = 0; // number of grades entered
    int aCount = 0; // count of A grades
    int bCount = 0; // count of B grades
    int cCount = 0; // count of C grades
    int dCount = 0; // count of D grades
    int fCount = 0; // count of F grades

    // create a Scanner object
    Scanner input = new Scanner(System.in);

    // prompt the user to enter grades
    System.out.printf("Enter the integer grades in the range 0-100.\n" +
                    "Type the end-of-file indicator to terminate input:\n" +
                    "On UNIX/Linux/macOS type <Ctrl> d then press Enter\n" +
                    "On Windows type <Ctrl> z then press Enter");

    // loop until the end-of-file indicator is entered
    while (input.hasNext()) {

      // read the next grade
      int grade = input.nextInt();

      // add the grade to the total
      total += grade;

      // increment the grade counter
      gradeCounter++;

      // increment the appropriate letter-grade counter
      switch (grade / 10) {
        case 9:
        case 10:
          aCount++;
          break;
        case 8:
          bCount++;
          break;
        case 7:
          cCount++;
          break;
        case 6:
          dCount++;
          break;
        default:
          fCount++;
          break;
      }
    }

    // display the grade report
    System.out.printf("\nGrade Report:\n");

    // if at least one grade was entered
    if (gradeCounter != 0) {

      // calculate the average grade
      double average = (double) total / gradeCounter;

      // display the summary of results
      System.out.printf("Total of the %d grades entered is %d\n",
                       gradeCounter, total);
      System.out.printf("Average grade is %.2f\n", average);
      System.out.printf("Number of students who received each grade:\n" +
                      "A: %d\n" +
                      "B: %d\n" +
                      "C: %d\n" +
                      "D: %d\n" +
                      "F: %d\n",
                      aCount, bCount, cCount, dCount, fCount);
    } else {
      // no grades were entered
      System.out.println("No grades were entered");
    }
  }
}

    
