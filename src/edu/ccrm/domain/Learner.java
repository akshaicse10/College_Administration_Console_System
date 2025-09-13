
package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Learner {
    private final int learnerId;
    private final String rollNo;
    private final String name;
    private final String contactEmail;
    private final boolean isEnrolled;
    private final LocalDate joinDate;
    private final List<Subject> subjectsTaken;

    public Learner(int learnerId, String rollNo, String name, String contactEmail) {
        this.learnerId = learnerId;
        this.rollNo = rollNo;
        this.name = name;
        this.contactEmail = contactEmail;
        this.isEnrolled = true;
        this.joinDate = LocalDate.now();
        this.subjectsTaken = new ArrayList<>();
    }

    public void addSubject(Subject subject) { subjectsTaken.add(subject); }
    public void removeSubject(Subject subject) { subjectsTaken.remove(subject); }

    public String obtainRollNo() { return rollNo; }
    public String obtainName() { return name; }
    public LocalDate obtainJoinDate() { return joinDate; }

    @Override
    public String toString() {
        return learnerId + " | " + rollNo + " | " + name + " | " + contactEmail + " | " + (isEnrolled ? "Enrolled" : "Not Enrolled");
    }
}
