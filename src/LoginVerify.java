import Course.CourseCtrl;
import Mark.MarksCtrl;
import Student.StudentCtrl;
import Registration.RegistrationCtrl;

import java.util.Scanner;

public class LoginVerify {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "toor";

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.print("Enter admin password: ");
            if (scan.next().equalsIgnoreCase(PASSWORD)) break;
            else System.out.println("Wrong password. Try again.");
        }

        int choice;

        do {
            System.out.print("\nWhat area to access? ");
            System.out.print("\n1: Courses, \n2: Students, \n3: Registration, \n4: Marks \n0: Quit\nChoice:");
            choice = scan.nextInt();

            switch(choice){
                case 1:
                    CourseCtrl courseCtrl = new CourseCtrl();
                    System.out.println("Initiating course controller...");
                    courseCtrl.init();
                    break;
                case 2:
                    StudentCtrl studentCtrl = new StudentCtrl();
                    System.out.println("Initiating student controller...");
                    studentCtrl.init();
                case 3:
                    RegistrationCtrl regCtrl = new RegistrationCtrl();
                    System.out.println("Initiating registration controller...");
                    regCtrl.init();
                case 4:
                    MarksCtrl mrkCtrl = new MarksCtrl();
                    System.out.println("Initiating Marks controller...");
                    mrkCtrl.init();
            }

        } while(choice != 0);
    }
}
