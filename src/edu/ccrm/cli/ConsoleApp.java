
package edu.ccrm.cli;

import edu.ccrm.domain.*;
import edu.ccrm.service.*;
import java.util.*;

public class ConsoleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LearnerManager learnerManager = new LearnerManager();
        SubjectManager subjectManager = new SubjectManager();
        RegistrationManager registrationManager = new RegistrationManager();

        int option;
        do {
            System.out.println("\n==== Academic Subject & Registration System ====");
            System.out.println("1. Add Learner");
            System.out.println("2. List Learners");
            System.out.println("3. Add Subject");
            System.out.println("4. List Subjects");
            System.out.println("5. Register Learner for Subject");
            System.out.println("6. Deregister Learner from Subject");
            System.out.println("7. List Registrations");
            System.out.println("8. Exit");
            System.out.print("Enter option: ");
            option = input.nextInt(); input.nextLine();

            switch(option) {
                case 1:
                    System.out.print("Enter Learner ID: "); int lId = input.nextInt(); input.nextLine();
                    System.out.print("Enter Roll No: "); String roll = input.nextLine();
                    System.out.print("Enter Name: "); String lName = input.nextLine();
                    System.out.print("Enter Email: "); String lEmail = input.nextLine();
                    learnerManager.insertLearner(new Learner(lId, roll, lName, lEmail));
                    break;
                case 2:
                    learnerManager.displayLearners();
                    break;
                case 3:
                    System.out.print("Enter Subject ID: "); String sId = input.nextLine();
                    System.out.print("Enter Subject Name: "); String sName = input.nextLine();
                    System.out.print("Enter Unit Count: "); int units = input.nextInt(); input.nextLine();
                    System.out.print("Enter Mentor: "); String mentor = input.nextLine();
                    System.out.print("Enter Faculty: "); String faculty = input.nextLine();
                    System.out.print("Enter Term (FIRST/SECOND/THIRD): ");
                    Term term = Term.valueOf(input.nextLine().toUpperCase());
                    subjectManager.insertSubject(new Subject(sId, sName, units, mentor, faculty, term));
                    break;
                case 4:
                    subjectManager.displaySubjects();
                    break;
                case 5:
                    System.out.print("Enter Learner Roll No: "); String lrRoll = input.nextLine();
                    System.out.print("Enter Subject ID: "); String subId = input.nextLine();
                    Learner learner = learnerManager.searchByRollNo(lrRoll);
                    Subject subject = subjectManager.searchById(subId);
                    if (learner != null && subject != null) registrationManager.register(learner, subject);
                    else System.out.println("Invalid Learner or Subject!");
                    break;
                case 6:
                    System.out.print("Enter Learner Roll No: "); lrRoll = input.nextLine();
                    System.out.print("Enter Subject ID: "); subId = input.nextLine();
                    learner = learnerManager.searchByRollNo(lrRoll);
                    subject = subjectManager.searchById(subId);
                    if (learner != null && subject != null) registrationManager.deregister(learner, subject);
                    else System.out.println("Invalid Learner or Subject!");
                    break;
                case 7:
                    registrationManager.displayRegistrations();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while(option != 8);
        input.close();
    }
}
