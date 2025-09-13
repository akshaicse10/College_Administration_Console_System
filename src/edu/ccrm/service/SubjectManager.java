
package edu.ccrm.service;

import edu.ccrm.domain.Subject;
import java.util.*;

public class SubjectManager {
    private List<Subject> subjectList = new ArrayList<>();

    public void insertSubject(Subject s) {
        subjectList.add(s);
        System.out.println("Subject inserted successfully!");
    }

    public void displaySubjects() {
        if (subjectList.isEmpty()) System.out.println("No subjects available.");
        else for (Subject s : subjectList) System.out.println(s);
    }

    public Subject searchById(String subjectId) {
        for (Subject s : subjectList) {
            if (s.fetchSubjectId().equalsIgnoreCase(subjectId)) return s;
        }
        return null;
    }
}
